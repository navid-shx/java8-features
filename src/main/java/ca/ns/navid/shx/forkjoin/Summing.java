package ca.ns.navid.shx.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

public class Summing extends RecursiveTask<Long> {

    public static final long THRESHOLD = 1000;

    private final long[] numbers;
    private final int start;
    private final int end;

    public Summing(long[] numbers) {
        this(numbers, 0, numbers.length);
    }

    public Summing(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {

        int length = this.end - this.start;
        if (length <= THRESHOLD) {
            return computeSequentially();
        }

        Summing leftTask = new Summing(numbers, start, start + length/2);
        leftTask.fork();

        Summing rightTask = new Summing(numbers, start + length/2, end);
        Long rightResult = rightTask.compute();

        //It is necessary to call join() after the computation of both subtasks has been started.
        //Otherwise, you’ll end up with a slower end up with a slower and more complex version of your original sequential algorithm.
        Long leftResult = leftTask.join();

        return leftResult + rightResult;
    }

    private long computeSequentially() {

        long sum = 0;

        for (int i = this.start; i < this.end; i++) {
            sum = sum + this.numbers[i];
        }

        return sum;
    }


    static void main() {

        long number = 10;
        long[] numbers = LongStream.rangeClosed(1, number).toArray();
        ForkJoinTask<Long> task = new Summing(numbers);
        Long result = new ForkJoinPool(Runtime.getRuntime().availableProcessors()).invoke(task);
        IO.println(result);
    }
}
