package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2024, 5, 8, 9, 40, 55);
        System.out.println("\nldt = " + ldt);

        LocalDateTime changeWith = ldt.with(ChronoField.YEAR, 2010);
        System.out.println("\nchangeWith = " + changeWith);

        LocalDateTime with2 = ldt.withYear(2010);
        System.out.println("\n편의메서드_with2 = " + with2);
        
        // TemporalAdjuster 사용
        // 기준 날짜 기준, 다음주 금요일... 은 몇일인가 계산해보기

        LocalDateTime nextFriday = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("\n기준 날짜 : ldt = " + ldt);
        System.out.println("날짜 기준 다음 금요일은 nextFriday = " + nextFriday);

        LocalDateTime withLastDayOfMonth = ldt.with(TemporalAdjusters.lastDayOfMonth());
        LocalDateTime withLastInMonth = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("\n기준 날짜 : ldt = " + ldt);
        System.out.println("날짜 기준 해당 월의 마지막 날 withLastDayOfMonth = " + withLastDayOfMonth);
        System.out.println("날짜 기준, 월의 마지막 일요일 lastInMonth(DayOfWeek.SUNDAY) = " + withLastInMonth);
    }
}
