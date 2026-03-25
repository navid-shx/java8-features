package ca.ns.navid.shx.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * This is an example of usage of java.util.{@link java.util.function.Function} functional interface.
 */
public class FunctionExample {

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {

        List<R> result = new ArrayList<>();

        for (T element : list) {
            result.add(function.apply(element));
        }

        return result;
    }

    void main() {

        //Map dates to years
        List<LocalDate> dates = List.of(LocalDate.now(),
                LocalDate.of(1776, 7, 4),
                LocalDate.of(1982, 7, 1),
                LocalDate.of(2000, 1, 1),
                LocalDate.of(1987, 4, 8));

        List<Integer> years = map(dates, LocalDate::getYear);
        //Or this one: List<Integer> years = map(dates, localDate -> localDate.getYear());
        IO.println(years);
    }
}
