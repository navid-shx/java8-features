package ca.ns.navid.shx.datetime.parsing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDateTime {

    static void main() {

        //String To Date By Predefined Formatter
        LocalDate date1 = LocalDate.parse("2026-01-01", DateTimeFormatter.ISO_DATE);
        LocalDate date2 = LocalDate.parse("20260101", DateTimeFormatter.BASIC_ISO_DATE);

        //String To Date By Custom Formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date3 = LocalDate.parse("2026/01/01", formatter);

        IO.println(date1);
        IO.println(date2);
        IO.println(date3);
    }
}
