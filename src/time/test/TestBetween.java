package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2026,6,22);
        System.out.println("시작일 : "+startDate);
        LocalDate endDate = LocalDate.of(2027,1,1);
        System.out.println("목표일 : "+endDate);

        long dDay = ChronoUnit.DAYS.between(startDate,endDate);
        System.out.println("D-day :"+dDay+"일 남았습니다.");
        Period period = Period.between(startDate,endDate);
        System.out.println("남은 기간: "+period.getYears()+"년 "+period.getMonths()+"개월 "+ period.getDays()+"일");
    }
}
