package ca.ns.navid.shx.streams;

import ca.ns.navid.shx.streams.model.Data;
import ca.ns.navid.shx.streams.model.Dish;

public class CountExample {

    static void main() {

        //Number of elements in the list
        long sizeOfList = Data.NUMBERS.stream().count();

        //Number of dishes in the menu
        long allDishes = Data.MENU.stream().count();

        //Number of vegetarian dishes in the menu
        long vegetarianDishes = Data.MENU.stream().filter(Dish::vegetarian).count();

        //Number of dishes with fewer than 400 calories
        long lowCaloricDishes = Data.MENU.stream().filter(dish -> dish.calories() < 400).count();

        //Number of dishes with higher than 300 calories
        long highCaloricDishes = Data.MENU.stream().filter(dish -> dish.calories() > 300).count();
    }
}
