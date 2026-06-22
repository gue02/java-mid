package time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016,8,16,8,10,1);
        System.out.println("현재 시각: " + nowDt);
        System.out.println("지정 시각: "+ ofDt);

        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("지정 날짜 : "+localDate);
        System.out.println("지정 시간 : "+localTime);

        System.out.println("localDateTime = " + LocalDateTime.of(localDate,localTime));

        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정 시각의 1000일 뒤 : "+ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.withYear(1);
        System.out.println("지정 시각의 1년 뒤 : "+ofDtPlus1Year);

        System.out.println("현재 시각이 지정 시각보다 이전인가?: "+ nowDt.isBefore(ofDt));
        System.out.println("현재 시각이 지정 시각보다 이후인가?: "+ nowDt.isAfter(ofDt));
        System.out.println("현재 시각이 지정 시각보다 동일한가?: "+ nowDt.isEqual(ofDt));
    }
}
