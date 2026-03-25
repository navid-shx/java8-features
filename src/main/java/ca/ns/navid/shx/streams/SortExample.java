package ca.ns.navid.shx.streams;

import ca.ns.navid.shx.streams.model.Data;
import ca.ns.navid.shx.streams.model.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortExample {

    static void main() {

        //Sort dishes by their calories
        List<Dish> sortedByCalories = Data.MENU.stream().sorted(Comparator.comparing(Dish::calories)).toList();

        //Sort dishes by their names
        Stream<Dish> sortedByNames = Data.MENU.stream().sorted(Comparator.comparing(Dish::name));

        //Sort names by natural order
        List<String> naturalOrderNames = Data.NAMES.stream().sorted(Comparator.naturalOrder()).toList();
    }
}
