package ca.ns.navid.shx.forkjoin;

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
}
