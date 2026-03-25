package ca.ns.navid.shx.streams;

import ca.ns.navid.shx.streams.model.Data;
import ca.ns.navid.shx.streams.model.Dish;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class MinExample {

    static void main() {

        //Min number in the list (4 solutions)
        Optional<Integer> min1 = Data.NUMBERS.stream().reduce(Integer::min);
        OptionalInt min2 = Data.NUMBERS.stream().mapToInt(Integer::valueOf).min();
        Optional<Integer> min3 = Data.NUMBERS.stream().min(Integer::compareTo);
        Optional<Integer> min4 = Data.NUMBERS.stream().reduce((num1, num2) -> {

            if (num1 < num2) {
                return num1;
            }

            return num2;
        });


        //Min calorie in the menu (3 solutions)
        Optional<Integer> minCalories1 = Data.MENU.stream().map(Dish::calories).reduce(Integer::min);
        OptionalInt minCalories2 = Data.MENU.stream().mapToInt(Dish::calories).min();
        OptionalInt minCalories3 = Data.MENU.stream().mapToInt(Dish::calories).reduce((cal1, cal2) -> {

            if (cal1 < cal2) {
                return cal1;
            }

            return cal2;
        });


        //Min caloric dish in the menu (2 solutions)
        Optional<Dish> minCaloricDish1 = Data.MENU.stream().min(Comparator.comparing(Dish::calories));
        Optional<Dish> minCaloricDish2 = Data.MENU.stream().reduce((dish1, dish2) -> {
            if (dish1.calories() < dish2.calories()) {
                return dish1;
            }

            return dish2;
        });
    }
}
