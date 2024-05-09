package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain_12 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2044, 1, 2, 23, 34, 45);
        extracted2(ldt);

        extracted1(ldt);

        extracted(ldt);
    }

    private static void extracted2(LocalDateTime ldt) {
        System.out.println("\nldt\t\t\t =  " + ldt);
        System.out.println(".get(ChronoField.YEAR)\t\t\t =  " + ldt.get(ChronoField.YEAR));
        System.out.println(".get(ChronoField.MONTH_OF_YEAR)\t =  " + ldt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(".get(ChronoField.DAY_OF_MONTH)\t =  " + ldt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(".get(ChronoField.HOUR_OF_DAY)\t =  " + ldt.get(ChronoField.HOUR_OF_DAY));
        System.out.println(".get(ChronoField.MINUTE_OF_HOUR)\t =  " + ldt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(".get(ChronoField.SECOND_OF_MINUTE)\t =  " + ldt.get(ChronoField.SECOND_OF_MINUTE));
    }

    private static void extracted1(LocalDateTime ldt) {
        System.out.println("\n-- 편의 메서드 제공 -- ");
        System.out.println("ldt\t\t\t = " + ldt);
        System.out.println(".getYear()\t = " + ldt.getYear());
        System.out.println(".getMonth()\t = " + ldt.getMonth());
        System.out.println(".getDayOfMonth() = " + ldt.getDayOfMonth());
        System.out.println(".getHour()\t\t = " + ldt.getHour());
        System.out.println(".getMinute()\t = " + ldt.getMinute());
        System.out.println(".getSecond()\t = " + ldt.getSecond());
    }

    private static void extracted(LocalDateTime ldt) {
        System.out.println("\n-- 메서드 미 제공 -- ");
        System.out.println("ldt\t\t\t = " + ldt);
        System.out.println(".get(ChronoField.MINUTE_OF_DAY)\t = " + ldt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println(".get(ChronoField.SECOND_OF_DAY))\t = " + ldt.get(ChronoField.SECOND_OF_DAY));
    }
}
