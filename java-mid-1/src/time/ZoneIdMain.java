package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        extracted();
        System.out.println();

        extracted1();
        System.out.println();

        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        System.out.println("zoneId(Asia/Seoul).getRules() = " + zoneId.getRules());
    }

    private static void extracted1() {

        // PC 환경 마다 다른 결과가 출력
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId.systemDefault = " + zoneId);
    }

    private static void extracted() {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            // ZoneId 지역 ID -> UTC 기준 섬머 타임 (일광 절약 시간 정보 등)
            System.out.println("availableZoneId = " + availableZoneId);

            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " // zoneId.getRules() = " + zoneId.getRules());
        }
    }
}
