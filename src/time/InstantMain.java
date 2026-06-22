package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("now = " + now);
        //now = 2026-06-22T12:25:55.376439600Z

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);
        //from = 2026-06-22T12:25:55.397458Z

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);
        //epochStart = 1970-01-01T00:00:00Z

        //계산 :
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);
        //later = 1970-01-01T01:00:00Z

        //조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
        //laterEpochSecond = 3600
    }
}
