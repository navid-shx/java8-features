package ca.ns.navid.shx.datetime.between;

import java.time.Duration;
import java.time.LocalTime;

public class TimeDuration {

    static void main() {

        //Time Duration
        LocalTime start = LocalTime.of(13, 45, 10);
        LocalTime end = LocalTime.of(20, 30, 50);

        Duration duration = Duration.between(start, end);
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        long seconds = duration.toSeconds();

        IO.println("From: " + start + " to: " + end);
        IO.println(hours + " hours and " + minutes + " minutes and " + seconds + " seconds");
    }
}
