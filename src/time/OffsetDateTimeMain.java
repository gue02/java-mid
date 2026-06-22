package time;

import java.time.*;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt = " + nowOdt);
        //nowOdt = 2026-06-22T21:14:16.074143800+09:00
        LocalDateTime ldt = LocalDateTime.of(2030,1,1,13,30,50);
        System.out.println("ldt = " + ldt);
        //ldt = 2030-01-01T13:30:50
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println("odt = " + odt);
        //odt = 2030-01-01T13:30:50+01:00
    }
}
