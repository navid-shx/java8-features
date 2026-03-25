package ca.ns.navid.shx.streams.infinite;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GenerateExample {

    void main() {

        //Generate 10 random numbers
        List<Double> random = Stream.generate(Math::random).limit(10).toList();

        //Even Odd numbers from 1 to 9
        AtomicInteger counter = new AtomicInteger(0);
        Stream.generate(() -> counter.getAndIncrement())
                .limit(10)
                .map(n -> n % 2 == 0 ? n + " (even)" : n + " (odd)")
                .forEach(IO::println);


        //10 first Fibonacci series
        IntSupplier fib = new IntSupplier(){
            private int previous = 0;
            private int current = 1;
            public int getAsInt(){
                int oldPrevious = this.previous;
                int nextValue = this.previous + this.current;
                this.previous = this.current;
                this.current = nextValue;
                return oldPrevious;
            }
        };
        IntStream.generate(fib).limit(10).forEach(IO::println);
    }
}
