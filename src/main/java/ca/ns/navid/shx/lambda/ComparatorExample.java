package ca.ns.navid.shx.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    void main(String[] args) {

        //Sort Words by their size
        List<String> words = Arrays.asList("water", "air", "flower", "home", "computer", "god", "perspective", "maple", "standard", "king");
        words.sort((w1, w2) -> w1.length() - w2.length());
        //Or this one by default method comparing -> words.sort(Comparator.comparing(String::length));
        IO.println(words);
    }
}
