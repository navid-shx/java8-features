package ca.ns.navid.shx.streams.model;

public record Dish(

        String name,
        boolean vegetarian,
        int calories,
        Type type) {

    public enum Type {
        MEAT,
        FISH,
        OTHER
    }
}
