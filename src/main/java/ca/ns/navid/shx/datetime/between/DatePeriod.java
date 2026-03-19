package ca.ns.navid.shx.datetime.between;

import java.time.LocalDate;
import java.time.Period;

public class DatePeriod {

    static void main() {

        LocalDate startDate = LocalDate.of(2000, 1, 1);
        LocalDate endDate = LocalDate.now();

        Period period = Period.between(startDate, endDate);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        IO.println("From: " + startDate + "\t to: " + endDate);
        IO.println("Years: " + years +  " Months: " + months + " Days: " + days);
    }
}
