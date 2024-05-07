package time;

import java.time.*;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetTime offSetNow = OffsetTime.now();
        System.out.println("offSetNow = " + offSetNow);

        System.out.println();
        LocalDateTime ldt = LocalDateTime.of(2022, 9, 21, 17, 23, 44);
        System.out.println("ldt = \n" + ldt);

        System.out.println();
        // java.time.DateTimeException: Invalid ID for ZoneOffset, non numeric characters found: UTC
        // OffsetDateTime zoneOffUtc = OffsetDateTime.of(ldt, ZoneOffset.of("UTC"));
        OffsetDateTime zoneOffUtc = OffsetDateTime.of(ldt, ZoneOffset.of("+05:00"));
        System.out.println("zoneOffUtc ( ldt + 05:00 ) = \n" + zoneOffUtc);

        /*
        * ZoneDateTime vs OffsetDateTime
        *
        *   1. ZoneDateTime
        *       => 지역별, 국가별 시간대에 대한 정확한 시간 계산이 필요할 때 주로 사용 (외국에서 시간 약속을 잡거나, 서비스 일정을 잡는 경우 등)
        *   2. OffsetDateTime
        *       => UTC 와 시간 차이만을 나타냄으로 지역 시간대의 정보를 얻는 목적 외
        *           특정 로그 스템프를 기록하거나, 데이터를 저장하고 처리할 때 적합하다.
        *
        * */

    }

}
