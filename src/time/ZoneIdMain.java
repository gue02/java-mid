package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for(String availableZoneId : ZoneId.getAvailableZoneIds()){
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
            //모든 세계 시각의 타임존 전부 제공
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("시스템 디폴트 : "+zoneId);
        //시스템 디폴트 : Asia/Seoul, 현재 시스템이 사용하는 ZoneId

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("서울 시간 : "+seoulZoneId);
        //서울 시간 : Asia/Seoul
    }
}
