package time.test;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TestAdjuster {
    public static void main(String[] args) {
        int year = 2026;
        int month = 6;
        LocalDate date = LocalDate.of(year,month,1);
        System.out.println("date = " + date);
        DayOfWeek dayOfFirst = date.getDayOfWeek();
        DayOfWeek dayofLast = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("dayOfFirst = " + dayOfFirst);
        System.out.println("dayofLast = " + dayofLast);
    }
}
