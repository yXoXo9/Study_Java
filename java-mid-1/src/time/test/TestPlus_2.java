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
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
//        int getYear = sc.nextInt();
        System.out.print("월을 입력하세요: ");
        System.out.println();
//        int getMonth = sc.nextInt();

//        System.out.println("getYear = " + getYear);
//        System.out.println("getMonth = " + getMonth);


        LocalDate localDate = LocalDate.of(2025, 1, 1);

        System.out.println("\nlocalDate.getDayOfWeek() = " + localDate.getDayOfWeek());
        int dayOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
        System.out.println("\ndayOfMonth = " + dayOfMonth);
        System.out.println();
        System.out.println("SU\tMo\tTu\tWe\tTh\tFr\tSa");
        int cnt = 1;
        for (int i = 1, j = 1; i <= dayOfMonth+3; i++) {
            String align = (i % 7 != 0) ? "\t" : "\n";
            System.out.print(((i < 13) ? " " : "") + ((i == (j+3)) ? j++ : "") + align);
        }


    }
}
