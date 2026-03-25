package ca.ns.navid.shx.streams;

import ca.ns.navid.shx.streams.model.Data;
import ca.ns.navid.shx.streams.model.Dish;

public class SummingExample {

    static void main() {

        //Summing of all numbers
        Integer sum = Data.NUMBERS.stream().reduce(0, Integer::sum); //or these:
        //Integer sum = Data.NUMBERS.stream().reduce(0, (num1, num2) -> num1 + num2);
        //int sum = Data.NUMBERS.stream().mapToInt(Integer::intValue).sum();


        //Total calories in the menu (3 solutions)
        Integer totalCalories1 = Data.MENU.stream().map(Dish::calories).reduce(0, Integer::sum); //or these:
        Integer totalCalories2 = Data.MENU.stream().map(Dish::calories).reduce(0, (cal1, cal2) -> cal1 + cal2);
        int totalCalories3 = Data.MENU.stream().mapToInt(Dish::calories).sum();


    }
}
