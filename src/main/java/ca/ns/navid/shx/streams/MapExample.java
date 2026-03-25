package ca.ns.navid.shx.streams;

import ca.ns.navid.shx.streams.model.Data;
import ca.ns.navid.shx.streams.model.Dish;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {

    static void main() {

        //Map dishes to their names
        List<String> names = Data.MENU.stream().map(Dish::name).toList();

        //Map dishes to their calories
        List<Integer> calories = Data.MENU.stream().map(Dish::calories).toList();

        //Map dishes to their types
        Set<Dish.Type> types = Data.MENU.stream().map(Dish::type).collect(Collectors.toSet());


        //Map names to their length
        List<Integer> nameLengths = Data.NAMES.stream()
                .map(String::length)
                .toList();
    }
}
