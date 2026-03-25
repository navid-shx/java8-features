package ca.ns.navid.shx.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * This is an example of usage of java.util.{@link Predicate} functional interface.
 */
public class PredicateExample {

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {

        List<T> result = new ArrayList<>();

        for (T element : list) {

            if (predicate.test(element)) {
                result.add(element);
            }
        }

        return result;
    }

    void main() {

        //Filter Even numbers
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = filter(numbers, num -> num % 2 == 0);
        IO.println(evenNumbers);
    }
}
