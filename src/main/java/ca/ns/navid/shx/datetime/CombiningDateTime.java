package ca.ns.navid.shx.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CombiningDateTime {

    static void main() {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        LocalDateTime date1 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 20);
        LocalDateTime date2 = LocalDateTime.of(date, time);
        LocalDateTime date3 = date.atTime(13, 45, 20);
        LocalDateTime date4 = date.atTime(time);
        LocalDateTime date5 = time.atDate(date);

        LocalDate dateFromDateTime = date1.toLocalDate();
        LocalTime timeFromDateTime = date1.toLocalTime();
    }
}
