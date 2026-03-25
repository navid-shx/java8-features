package ca.ns.navid.shx.streams;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class NumericRangesExample {

    static void main() {

        //Stream of ints from 1 to 100
        IntStream numbers1 = IntStream.rangeClosed(1, 100);

        //Stream of ints from 1 to 99
        IntStream numbers2 = IntStream.range(1, 100);

        //Even numbers from 1 to 100
        List<Integer> evenNumbers = IntStream.rangeClosed(1, 100).filter(number -> number % 2 == 0).boxed().toList();

        //Squares of numbers from 1 to 100
        List<Integer> squares = IntStream.rangeClosed(1, 100).map(num -> num * num).boxed().toList();


        //Prime numbers from 1 to 100
        IntPredicate primePredicate = num -> {
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
        List<Integer> primeNumbers = IntStream.rangeClosed(1, 100).filter(primePredicate).boxed().toList();
    }
}
