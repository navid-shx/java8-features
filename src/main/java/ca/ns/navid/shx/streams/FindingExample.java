package ca.ns.navid.shx.streams;

import ca.ns.navid.shx.streams.model.Data;
import ca.ns.navid.shx.streams.model.Dish;

import java.util.Optional;

public class FindingExample {

    static void main() {

        //Find a vegetarian dish
        Optional<Dish> dish = Data.MENU.stream()
                .filter(Dish::vegetarian)
                .findAny();


        //Print the name of a vegetarian dish if exists
        Data.MENU.stream()
                .filter(Dish::vegetarian)
                .findAny()
                .ifPresent(d -> IO.println(d.name()));


        //Finds the first square that’s divisible by 3:
        Optional<Integer> firstSquareDivisibleByThree = Data.NUMBERS.stream()
                .map(x -> x * x)
                .filter(x -> x % 3 == 0)
                .findFirst(); // 9
    }
}
