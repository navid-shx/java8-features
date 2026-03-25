package ca.ns.navid.shx.streams;

import ca.ns.navid.shx.streams.model.Data;
import ca.ns.navid.shx.streams.model.Dish;

import java.util.List;

public class FilterExample {

    void main() {

        //Get even numbers
        List<Integer> evenNumbers = Data.NUMBERS.stream().filter(num -> num % 2 == 0).toList();

        //Get prime numbers
        List<Integer> primeNumbers = Data.NUMBERS.stream().filter(num -> {

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
        }).toList();


        //Get dishes with fewer than 400 calories
        List<Dish> lowCaloricDishes = Data.MENU.stream().filter(dish -> dish.calories() < 400).toList();

        //Get dishes with higher than 300 calories
        List<Dish> highCaloricDishes = Data.MENU.stream().filter(dish -> dish.calories() > 300).toList();

        //Get vegetarian dishes
        List<Dish> vegetarianDishes = Data.MENU.stream().filter(Dish::vegetarian).toList();
    }
}
