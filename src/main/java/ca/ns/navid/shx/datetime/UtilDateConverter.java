package ca.ns.navid.shx.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public final class UtilDateConverter {

    private UtilDateConverter() {
        throw new UnsupportedOperationException("Cannot be instantiated");
    }

    //Convert Date → LocalDate
    public static LocalDate dateToLocalDate(Date date) {

        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    //Convert Date → LocalTime
    public static LocalTime dateToLocalTime(Date date) {

        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalTime();
    }

    //Convert Date → LocalDateTime
    public static LocalDateTime dateToLocalDateTime(Date date) {

        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

    //Convert LocalDate → Date
    public static Date localDateToDate(LocalDate localDate) {

        return Date.from(localDate
                .atStartOfDay(ZoneId.systemDefault())
                .toInstant());
    }

    //Convert LocalTime → Date
    public static Date localTimeToDate(LocalTime localTime) {
        return Date.from(localTime
                .atDate(LocalDate.now())
                .atZone(ZoneId.systemDefault())
                .toInstant());
    }

    //Convert LocalDateTime → Date
    public static Date localDateTimeToDate(LocalDateTime localDateTime) {

        return Date.from(localDateTime
                .atZone(ZoneId.systemDefault())
                .toInstant());
    }
}
