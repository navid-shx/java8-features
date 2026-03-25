package ca.ns.navid.shx.streams.infinite;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IterateExample {

    private static final Predicate<Integer> PRIME_PREDICATE = num -> {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    };


    void main() {

        //10 first even numbers
        List<Integer> evens = Stream.iterate(0, n -> n + 2).limit(10).toList();

        //20 first prime numbers
        List<Integer> primes = Stream.iterate(2, num -> num + 1).filter(PRIME_PREDICATE).limit(20).toList();

        //Squares of 1 to 100
        List<Integer> squares = Stream.iterate(0, num -> num + 1).map(num -> num * num).limit(100).toList();

        //10 first Fibonacci series
        List<Integer> fibonacci = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(t -> t[0])
                .toList();
    }
}
