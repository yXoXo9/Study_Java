package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeMain {
    public static void main(String[] args) {
        System.out.println();
        ZonedDateTime nowZdt = ZonedDateTime.now(); // SystemDefaultZoneID 사용
        System.out.println("nowZdt = " + nowZdt);

        System.out.println();
        extracted();

        // (현재 지역 기준) 런던 시간을 확인
        ZonedDateTime utc = nowZdt.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println();
        System.out.println("utc = " + utc);

    }

    private static void extracted() {
        // ldt 를 기반으로 ZoneId 를 만들 수 있다.
        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime = " + zonedDateTime);

        System.out.println();
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2030, 12, 10, 18, 22, 45, 0, ZoneId.of("Asia/Tokyo"));
        System.out.println("zonedDateTime1(Asia/Tokyo) = " + zonedDateTime1);
    }
}
