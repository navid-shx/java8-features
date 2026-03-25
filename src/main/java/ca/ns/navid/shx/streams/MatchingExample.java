package ca.ns.navid.shx.streams;

import ca.ns.navid.shx.streams.model.Data;
import ca.ns.navid.shx.streams.model.Dish;

public class MatchingExample {

    static void main() {

        //If there is any vegetarian dish in the menu.
        boolean isVegetarianFriendly = Data.MENU.stream().anyMatch(Dish::vegetarian);

        //If there is any dish with fewer than 1000 calories
        boolean isHealthy1 = Data.MENU.stream().allMatch(d -> d.calories() < 1000);
        boolean isHealthy2 = Data.MENU.stream().noneMatch(d -> d.calories() >= 1000);


        //If there is any name in the list which begins with N
        boolean beginswithN = Data.NAMES.stream().anyMatch(name -> name.startsWith("N"));
    }
}
