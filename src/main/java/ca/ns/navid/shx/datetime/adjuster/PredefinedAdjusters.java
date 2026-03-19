package ca.ns.navid.shx.datetime.adjuster;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class PredefinedAdjusters {

    static void main() {

        //Example-1
        LocalDate date1 = LocalDate.of(2014, 3, 18); // 2014-03-18
        LocalDate date2 = date1.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)); // Next Sunday: 2014-03-23
        LocalDate date3 = date2.with(TemporalAdjusters.lastDayOfMonth()); // 2014-03-31


        //First day of the month
        LocalDate dt1 = LocalDate.of(2026, 3, 18);
        LocalDate firstDay = dt1.with(TemporalAdjusters.firstDayOfMonth()); // 2026-03-01


        //Last day of the month
        LocalDate dt2 = LocalDate.of(2026, 3, 18);
        LocalDate lastDay = dt2.with(TemporalAdjusters.lastDayOfMonth()); // 2026-03-31


        //Next Monday
        LocalDate dt3 = LocalDate.of(2026, 3, 18);
        LocalDate nextMonday = dt3.with(TemporalAdjusters.next(DayOfWeek.MONDAY));


        //First Monday of the month
        LocalDate dt4 = LocalDate.of(2026, 3, 18);
        LocalDate firstMonday = dt4.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));


        //Last Friday of the month
        LocalDate dt5 = LocalDate.of(2026, 3, 18);
        LocalDate lastFriday = dt5.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));


        //First day of next year
        LocalDate dt6 = LocalDate.of(2026, 3, 18);
        LocalDate nextYear = dt6.with(TemporalAdjusters.firstDayOfNextYear());
    }
}
