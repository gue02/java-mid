package time.test;

import java.time.LocalDate;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024,1,1);
        System.out.println("기준 시각: "+localDate);
        for(int i = 1; i <= 5; i++){
            localDate = localDate.plusWeeks(2);
            System.out.println("날짜 "+i+": "+localDate);
        }
    }
}
