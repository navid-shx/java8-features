package ca.ns.navid.shx.streams.model;

public record Transaction(

        Trader trader,
        int year,
        int value) {
}
