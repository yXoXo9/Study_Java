package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.*;
import java.util.Arrays;
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
        // 달의 첫날 (달력의 첫날 데이터를 만듦)
        LocalDate firstDayOfMonth = LocalDate.of(iYear, iMonth, 1); // 얘 : 1월 1일
        // 사용자가 입력한 달 + 한달을 증가 함으로써 다음달의 첫 날을 생성
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1); // 예 : 2월 1일

        // 입력한 월의 첫 요일을 월:1 ~ 일:7 을 기준으로 로 계산
        int offSetOfWeekValue = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        // System.out.println("firstDayOfMonth.dayOfWeek = " + offSetOfWeekValue); // 2024년 3월의 첫 날 dayOfWeek = FRIDAY
        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < offSetOfWeekValue; i++) {
            System.out.print("   "); // 일의 칸수(3칸) => 'Su '.length = 3
            // "   ""   ""   "
        }
        // 입력한 월의 첫날 값을 반복하여 출력하기 위해 의미있는 변수 설정
        LocalDate dayIterator = firstDayOfMonth;
        // DayOfWeek value = DayOfWeek.values()[1];
        // System.out.println("value = " + value);
        // System.out.println("DayOfWeek.values() = " + Arrays.toString(DayOfWeek.values()));
        // 첫날 값이 해당 값 보다 (isBefore) 이전일 때 까지, (다음달 1일 전 까지)
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            // 일을 출력 하고,
            // System.out.print(dayIterator.getDayOfMonth());
            // 12345678910111213141516171819202122232425262728293031
            // System.out.print(dayIterator.getDayOfMonth() + " "); 1~31 까지의 출력 칸 수를 고정해야 함
            // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31

            System.out.printf("%2d ", dayIterator.getDayOfMonth()); // 2자리 정수형은 고정으로 출력하되, 한칸씩 띄어쓰기
            // 토요일 마다 개행
            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }
            // 하루씩 증가한 불변 객체를 조건문에 해당되는 객체에 전달
            dayIterator = dayIterator.plusDays(1);

        }
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
