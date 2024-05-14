package time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestPlus_2 {
    public static void main(String[] args) {
        // diy();
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도 입력 : ");
        int iYear = scanner.nextInt();
        System.out.print("월 입력 : ");
        int iMonth= scanner.nextInt();

        printCalender(iYear, iMonth);

    }

    private static void printCalender(int iYear, int iMonth) {
        
    }

    private static void diy() {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int getYear = sc.nextInt();
        System.out.print("월을 입력하세요: ");
        int getMonth = sc.nextInt();

        LocalDate localDate = LocalDate.of(getYear, getMonth, 1);
        System.out.println("\nlocalDate.getDayOfWeek() = " + localDate.getDayOfWeek().getValue());
        int dayOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);

        System.out.println(getYear + " / " + getMonth + "\n");
        System.out.println("Su\tMo\tTu\tWe\tTh\tFr\tSa");
        // System.out.println("알\t월\t화\t수\t목\t금\t토");
        int interval = localDate.getDayOfWeek().getValue();
        for (int i = 1, j = 1; i <= dayOfMonth + interval; i++) {
            String align = (i % 7 != 0) ? "\t" : "\n";
            System.out.print(((i < 10 + interval) ? " " : "") + ((i == (j + interval)) ? j++ : "") + align);
        }
    }
}
