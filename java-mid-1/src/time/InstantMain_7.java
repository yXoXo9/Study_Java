package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain_7 {
    public static void main(String[] args) {
        /*
        * Instant Time = Epoch Time = Unix Timestamp
        * 1.1.1970 ~ 시작된 seconds & nanos
        * */
        extracted2();
        System.out.println();
        extracted1();
        System.out.println();
        extracted();
        System.out.println();

    }

    private static void extracted2() {
        // 생성
        Instant now = Instant.now();
        System.out.println("now = " + now); // UTC 기준이기 때문에 -9 시간 해야 함
    }

    private static void extracted1() {
        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from); // Instant 추출
    }

    private static void extracted() {
        // Instant 시작 부터 + 0 초
        Instant iofETime = Instant.ofEpochSecond(0);
        System.out.println("iofETime+0 = " + iofETime);

        // Instant 시작 부터 + 120 초
        iofETime = Instant.ofEpochSecond(120);
        System.out.println("iofETime+120 = " + iofETime);

        // 계산
        Instant plus = iofETime.plusSeconds(3600);
        System.out.println("plus+3600(1_Hr) = " + plus);

        // 조회
        long epochAfterSecond = plus.getEpochSecond();
        System.out.println("epochAfterSecond_흐른 시간 = " + epochAfterSecond);
    }
}
