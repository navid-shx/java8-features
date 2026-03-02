package ca.ns.navid.shx.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class Factorial extends RecursiveTask<Long> {

    protected long number;

    public Factorial(long number) {
        this.number = number;
    }

    @Override
    protected Long compute() {

        if (this.number == 0) {
            return this.computeSequentially();
        }

        Factorial leftTask = new Factorial(this.number - 1);
        leftTask.fork();

        Factorial rightTask = new Factorial(this.number);
        long rightResult = rightTask.computeSequentially();

        Long leftResult = leftTask.join();

        return rightResult * leftResult;
    }

    private long computeSequentially() {

        if (this.number == 0) {
            return 1;
        }

        return this.number;
    }


    static void main() {

        int number = 5;
        ForkJoinTask<Long> factorial = new Factorial(number);
        Long result = new ForkJoinPool(1).invoke(factorial);
        IO.println(number + "! = " + result);
    }
}
