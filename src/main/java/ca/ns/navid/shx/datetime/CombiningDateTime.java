package ca.ns.navid.shx.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CombiningDateTime {

    static void main() {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        LocalDateTime dateTime1 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 20);
        LocalDateTime dateTime2 = LocalDateTime.of(date, time);
        LocalDateTime dateTime3 = date.atTime(13, 45, 20);
        LocalDateTime dateTime4 = date.atTime(time);
        LocalDateTime dateTime5 = time.atDate(date);

        LocalDate dateFromDateTime = dateTime1.toLocalDate();
        LocalTime timeFromDateTime = dateTime1.toLocalTime();
    }
}
