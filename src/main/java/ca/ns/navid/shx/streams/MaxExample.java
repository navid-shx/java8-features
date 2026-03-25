package ca.ns.navid.shx.streams;

import ca.ns.navid.shx.streams.model.Data;
import ca.ns.navid.shx.streams.model.Dish;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class MaxExample {

    static void main() {

        //Max number in the list (4 solutions)
        Optional<Integer> max1 = Data.NUMBERS.stream().reduce(Integer::max);
        OptionalInt max2 = Data.NUMBERS.stream().mapToInt(Integer::valueOf).max();
        Optional<Integer> max3 = Data.NUMBERS.stream().max(Integer::compareTo);
        Optional<Integer> max4 = Data.NUMBERS.stream().reduce((num1, num2) -> {

            if (num1 > num2) {
                return num1;
            }

            return num2;
        });


        //Max calorie in the menu (3 solutions)
        Optional<Integer> maxCalories1 = Data.MENU.stream().map(Dish::calories).reduce(Integer::max);
        OptionalInt maxCalories2 = Data.MENU.stream().mapToInt(Dish::calories).max();
        OptionalInt maxCalories3 = Data.MENU.stream().mapToInt(Dish::calories).reduce((cal1, cal2) -> {

            if (cal1 > cal2) {
                return cal1;
            }

            return cal2;
        });


        //Max caloric dish in the menu (2 solutions)
        Optional<Dish> maxCaloricDish1 = Data.MENU.stream().max(Comparator.comparing(Dish::calories));
        Optional<Dish> maxCaloricDish2 = Data.MENU.stream().reduce((dish1, dish2) -> {

                    if (dish1.calories() > dish2.calories()) {
                        return dish1;
                    }

                    return dish2;
                });
    }
}
