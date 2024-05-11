package time.test;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;

public class TestPlus {
    public static void main(String[] args) {
        quest_1();
        System.out.println();

        quest_2();
        System.out.println();

        /*
        * 시작 날짜와 목표 날짜를 입력하여 남은 기간과 디데이를 구할 것
        * 남은 기간: x년 x개월 x일 형식으로 출력
        * 디데이: x일 남은 형식으로 출력
        * */
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        Period between1 = Period.between(startDate, endDate);
        System.out.println("1.남은 기간: " + between1.getYears() + "년 " + between1.getMonths() +"개월 " + between1.getDays()+ "일");

        LocalDate diffDate = endDate.minusYears(startDate.getYear()).minusMonths(startDate.getMonthValue()).minusDays(startDate.getDayOfMonth());
        System.out.println("2.남은 기간: " + diffDate.format(DateTimeFormatter.ofPattern("Y년 MM개월 dd일")));

        LocalDate localDate = endDate.minusDays(startDate.getDayOfYear());
        System.out.println("디데이: " + localDate.getDayOfYear() + "일 남은");
    }

    private static void quest_2() {
        /*
        * 2024년 1월 1일 부터 2주 간격으로 5번 반복하여 날짜를 출력하는 코드
        * */
        LocalDate localDate = LocalDate.of(2024, 1, 1);
        int cnt = 0;
        while (cnt < 5){
            System.out.println("날짜 " + (cnt + 1) + ": " + localDate.plusWeeks((2L * cnt)));
            cnt++;
        }
        System.out.println("\ndo_FOR");
        for (int i = 0; i < 5; i++){
            System.out.println("날짜 " + (i + 1) + ": " + localDate.plusWeeks((2 * i)));
        }
        System.out.println("\ndo_FOR_2");
        for (int i = 0, j = 0; i < 5; i++, j = i * 2){
            System.out.println("날짜 " + (i + 1) + ": " + localDate.plusWeeks(j));
        }
        System.out.println("\ndo_FOR_3");
        for (int i = 0; i < 5; i++){
            System.out.println("날짜 " + (i + 1) + ": " + localDate.plus(2 * i, ChronoUnit.WEEKS));
        }
    }

    private static void quest_1() {
        /*
        * 2024년 1월 1일 0시 0분 0초에 1년 2개월 3일 4시간 후의 시각을 찾아라.
        * */
        LocalDateTime ldt = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("기준 시각 : " + ldt);
        LocalDateTime plusLdt = ldt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + plusLdt);
    }
}
