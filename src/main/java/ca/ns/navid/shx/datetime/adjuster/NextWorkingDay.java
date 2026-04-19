package ca.ns.navid.shx.datetime.adjuster;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

/**
 * Develop a class named NextWorkingDay, implementing the interface TemporalAdjuster
 * that moves a date forward by one day but skips Saturdays and Sundays. Doing the following
 * date = date.with(new NextWorkingDay());
 */
public class NextWorkingDay implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {

        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        if (dayOfWeek == DayOfWeek.FRIDAY || dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            return temporal.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }

        return temporal.plus(1, ChronoUnit.DAYS);
    }

    static void main() {

        LocalDate today = LocalDate.now();
        LocalDate nextWorkingDay = today.with(new NextWorkingDay());
        IO.println("Next Working Day: " + nextWorkingDay);
    }
}
