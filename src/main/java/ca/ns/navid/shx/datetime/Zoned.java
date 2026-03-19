package ca.ns.navid.shx.datetime;

import java.time.*;

public class Zoned {

    static void main() {

        ZonedDateTime systemZoned1 = ZonedDateTime.now();
        ZonedDateTime systemZoned2 = ZonedDateTime.now(ZoneId.systemDefault());
        ZonedDateTime newYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime rome = ZonedDateTime.now(ZoneId.of("Europe/Rome"));
        ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));


        IO.println("System-Zone: " + systemZoned1);
        IO.println("System-Zone: " + systemZoned2);
        IO.println("NewYork-Zone: " + newYork);
        IO.println("Rome-Zone: " + rome);
        IO.println("London-Zone: " + london);
    }
}
