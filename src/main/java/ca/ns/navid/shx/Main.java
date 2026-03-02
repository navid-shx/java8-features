package ca.ns.navid.shx;

import ca.ns.navid.shx.forkjoin.Factorial;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main() {

        int number = 5;
        ForkJoinTask<Long> factorial = new Factorial(number);
        Long result = new ForkJoinPool(1).invoke(factorial);
        IO.println(number + "! = " + result);
    }
}
