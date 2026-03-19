package ca.ns.navid.shx.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ManipulatingDate {

    static void main() {

        // Example-1
        LocalDate date1 = LocalDate.of(2014, 3, 18); // 2014-03-18
        LocalDate date2 = date1.withYear(2011); // 2011-03-18
        LocalDate date3 = date2.withDayOfMonth(25); // 2011-03-25
        LocalDate date4 = date3.with(ChronoField.MONTH_OF_YEAR, 9); // 2011-09-25


        // Example-2
        LocalDate dt1 = LocalDate.of(2014, 3, 18); // 2014-03-18
        LocalDate dt2 = date1.plusWeeks(1); // 2014-03-18
        LocalDate dt3 = date2.minusYears(3); //2011-03-25
        LocalDate dt4 = date3.plus(6, ChronoUnit.MONTHS); // 2011-09-25


        // Example-3
        LocalDate date = LocalDate.of(2014, 3, 18); // 2014-03-18
        date = date.with(ChronoField.MONTH_OF_YEAR, 9); // 2014-09-18
        date = date.plusYears(2).minusDays(10); // 2016-09-08
        date.withYear(2011); // It doesn't affect, LocalDate is immutable
    }
}
