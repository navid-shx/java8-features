package ca.ns.navid.shx.datetime.between;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeDuration {

    static void main() {

        //Duration Between LocalTimes
        LocalTime start1 = LocalTime.of(13, 45, 10);
        LocalTime end1 = LocalTime.of(20, 30, 50);
        Duration duration1 = Duration.between(start1, end1);
        IO.println("From: " + start1 + " to: " + end1);
        IO.println("Hours: " + duration1.toHours() + "\nMinutes: " + duration1.toMinutes() + "\nSeconds: " + duration1.toSeconds());
        IO.println(duration1.toHours() + "h " + duration1.toMinutesPart() + "m " + duration1.toSecondsPart() + "s");

        IO.println("\n");

        //Duration Between LocalDateTimes
        LocalDateTime start2 = LocalDateTime.of(2026, 1, 1, 0, 0, 0);
        LocalDateTime end2 = LocalDateTime.of(2026, 1, 2, 10, 10, 30);
        Duration duration2 = Duration.between(start2, end2);
        IO.println("From: " + start2 + " to: " + end2);
        IO.println("Hours: " + duration2.toHours() + "\nMinutes: " + duration2.toMinutes() + "\nSeconds: " + duration2.toSeconds());
        IO.println(duration2.toHours() + "h " + duration2.toMinutesPart() + "m " + duration2.toSecondsPart() + "s");
    }
}
