package ca.ns.navid.shx.datetime.parsing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeToString {

    static void main() {

        LocalDate today = LocalDate.now();

        //Date To String By Predefined formatter
        String basicIsoDate = today.format(DateTimeFormatter.BASIC_ISO_DATE);
        String isoLocalDate = today.format(DateTimeFormatter.ISO_LOCAL_DATE);

        //Date To String By Custom Date Formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String customDate = today.format(formatter);

        IO.println("Basic-ISO-Date: " + basicIsoDate);
        IO.println("ISO-Local-Date: " + isoLocalDate);
        IO.println("Custom: " + customDate);
    }
}
