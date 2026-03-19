package ca.ns.navid.shx.datetime.parsing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class BuildingDateTimeFormatter {

    static void main() {

        DateTimeFormatter italianFormatter = new DateTimeFormatterBuilder()
                .appendText(ChronoField.DAY_OF_MONTH)
                .appendLiteral(", ")
                .appendText(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(" ")
                .appendText(ChronoField.YEAR)
                .parseCaseInsensitive()
                .toFormatter(Locale.ITALIAN);

        DateTimeFormatter englishFormatter = new DateTimeFormatterBuilder()
                .appendText(ChronoField.DAY_OF_MONTH)
                .appendLiteral(", ")
                .appendText(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(" ")
                .appendText(ChronoField.YEAR)
                .parseCaseInsensitive()
                .toFormatter(Locale.ENGLISH);

        LocalDate today = LocalDate.now();
        String italianText = today.format(italianFormatter);
        String englishText = today.format(englishFormatter);

        IO.println("Italian: " + italianText);
        IO.println("English: " + englishText);
    }
}
