package ca.ns.navid.shx.streams.model;

import java.util.Arrays;
import java.util.List;

public final class Data {

    public static final List<Dish> MENU = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH) );


    public static final List<String> NAMES = Arrays.asList(
            "John", "Negar", "Sara", "Thomas", "Nikrad", "Nooshin", "Mike", "Alex", "Nelly",
            "Sepehr", "Donald", "Behnaz", "Ronald", "Mina", "Alison", "Sina", "Jack", "Paria",
            "Henry", "Parsa", "George", "Mahsa", "Catherine", "Kimia", "Samuel", "Soodabeh");


    public static final List<Integer> NUMBERS = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


    private static final Trader RAOUL = new Trader("Raoul", "Cambridge");
    private static final Trader MARIO = new Trader("Mario","Milan");
    private static final Trader ALAN = new Trader("Alan","Cambridge");
    private static final Trader BRIAN = new Trader("Brian","Cambridge");
    public static final List<Transaction> TRANSACTIONS = Arrays.asList(
            new Transaction(BRIAN, 2011, 300),
            new Transaction(RAOUL, 2012, 1000),
            new Transaction(RAOUL, 2011, 400),
            new Transaction(MARIO, 2012, 710),
            new Transaction(MARIO, 2012, 700),
            new Transaction(ALAN, 2012, 950)
    );


    private Data() {
        throw new UnsupportedOperationException("Cannot be instantiated");
    }
}
