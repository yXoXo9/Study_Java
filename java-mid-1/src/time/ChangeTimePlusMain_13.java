package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain_13 {
    public static void main(String[] args) {
        extracted();
        System.out.println();
        /*
        * 하지만 모든 시간을 조작할 수 있는건 아니다..
        * */

        LocalDate nowYMD = LocalDate.now();// 년 월 일 만 존재
        // .UnsupportedTemporalTypeException: Unsupported field: SecondOfMinute
        // int nowYMDGet = nowYMD.get(ChronoField.SECOND_OF_MINUTE); // 초를 꺼낼 수 없다. ( 날짜 정보만 갖고 있음, 분에 대한 정보는 없다. )
        // System.out.println("nowYMD.getSECOND_OF_MINUTE = " + nowYMDGet);

        System.out.println("-- 지원 여부 확인하는 메서드 -- ");
        boolean isSupported = nowYMD.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("nowYMD.isSupported(ChronoField.SECOND_OF_MINUTE)?? = " + isSupported);


    }

    private static void extracted() {
        /*
        * 날짜와 시간을 조작하기 위한 어떠한 시간 단위(Unit)를 변경할 지 선택,
        * 이때 날짜와 시간  단위를 뜻하는 ChronoUnit 을 사용
        * */
        LocalDateTime ldt = LocalDateTime.of(2002, 04, 05, 14, 30, 59);
        System.out.println("\nldt = " + ldt);

        LocalDateTime plus = ldt.plus(10, ChronoUnit.YEARS);
        System.out.println("ldt.plus(10, ChronoUnit.YEARS) = " + plus);
        System.out.println("ldt.plusYears(10) = " + ldt.plusYears(10));

        Period period10Y = Period.ofYears(10);// 10 년 이라는 기간 정의
        System.out.println("\nperiod10Y = " + period10Y);
        LocalDateTime plusPeriod10Y = ldt.plus(period10Y);
        System.out.println("ldt.plus(period10Y) = " + plusPeriod10Y);
    }
}
