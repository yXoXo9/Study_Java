package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain_3 {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        System.out.println("현재 날짜 및 시간  = " + nowDt);

        LocalDateTime ofDt = LocalDateTime.of(2002, 4, 16, 8, 10, 1);
        System.out.println("지정 날짜 및 시간 = " + ofDt);

        // 계산 (불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(910);
        System.out.println("지정 날짜 + 910d = " + ofDtPlus);

        LocalDateTime ofDtPlusYear = ofDt.plusYears(3);
        System.out.println("지정 날짜 + 3y = " + ofDtPlusYear);

        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        System.out.println("LocalDateTime 날짜 분리 : localDate = " + localDate);

        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("LocalDateTime 시간 분리 : localTime = " + localTime);

        // 날짜와 시간 연결
        LocalDateTime concatDt = LocalDateTime.of(localDate, localTime);
        System.out.println("날짜 인스턴스, 시간 인스턴스 of(localDate, localTime) = " + concatDt);

        // 비교
        System.out.println("현재 날짜 시간, 지정 날짜 시간 'isBefore' ? " +
                nowDt.isBefore(ofDt));

        System.out.println("현재 날짜 시간, 지정 날짜 시간 'isAfter' ? " +
                nowDt.isAfter(ofDt));

        // equals 와는 다른 isEquals...
        //       => 다른 날짜 시간과 시간적으로로 동일한지 비교한다.

        /*
        * isEqual() vs equals()
        *
        * 1. isEqual() : - 동등성 비교 느낌
        *       비교 대상이 '시간적으로' 같으면 true, 즉, 객채 참조값이 다르고 타임존이 다르더라도,
        *       시간적으로 같으면 true (== 서울의 9시와 UTC 의 0시는 시간적으로 같다. 서울 = UTC+9 이기때문)
        *
        * 2. equals() : - 동일성 비교 느낌
        *       객체의 타입, 타임존 등 내부 데이터의 모든 요소가 같아야 true 를 반환
        *       (== 서울의 9시와 UTC 0시는 시간적으로는 같지만, 타임존의 데이터가 다르므로 false 를 반환한다.)
        * */
        System.out.println("현재 날짜 시간 isEqual 지정 날짜 '동일' ? " + nowDt.isEqual(ofDt));
        System.out.println("현재 날짜 시간 equals 지정 날짜 '동일' ? " + nowDt.equals(ofDt));
    }
}
