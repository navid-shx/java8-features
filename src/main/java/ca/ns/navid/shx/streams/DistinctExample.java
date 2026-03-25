package ca.ns.navid.shx.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctExample {

    static void main() {

        List<String> names = Arrays.asList("John", "John", "Sara", "Sara", "Sepehr", "Sepehr");

        //Removing repetitive elements by distinct() method
        List<String> result1 = names.stream().distinct().toList();

        //Removing repetitive elements by collecting as set
        Set<String> result2 = names.stream().collect(Collectors.toSet());
    }
}
