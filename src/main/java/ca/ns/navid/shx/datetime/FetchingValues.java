package ca.ns.navid.shx.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class FetchingValues {

    static void main() {

        LocalDate today = LocalDate.now();
        int dayOfMonth = today.getDayOfMonth();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        Month month = today.getMonth();
        int dayOfYear = today.getDayOfYear();

        LocalDate birthdate = LocalDate.of(2000, Month.AUGUST, dayOfMonth);
        int birthdateDay = birthdate.get(ChronoField.DAY_OF_MONTH);
        int birthdateDayOfWeek = birthdate.get(ChronoField.DAY_OF_WEEK);
        int birthdateMonth = birthdate.get(ChronoField.MONTH_OF_YEAR);
        int birthdateYear = birthdate.get(ChronoField.YEAR);

        LocalTime now = LocalTime.now();
        int nowHour = now.getHour();
        int nowMinute = now.getMinute();
        int nowSecond = now.getSecond();
        int NowNanoSecond = now.getNano();

        LocalTime time = LocalTime.of(22, 10, 0, 0);
        int hour = time.get(ChronoField.HOUR_OF_DAY);
        int minute = time.get(ChronoField.MINUTE_OF_HOUR);
        int second = time.get(ChronoField.SECOND_OF_MINUTE);
        int nanoSecond = time.get(ChronoField.NANO_OF_SECOND);
    }
}
