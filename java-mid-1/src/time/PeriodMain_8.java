package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain_8 {
    public static void main(String[] args) {
        // 생성
        Period period = Period.ofDays(10);
        System.out.println("\nperiod = " + period); // period = P10D 10일 동안. (시각, 시점) , amount of time

        // 계산에 사용
        LocalDate currentDate = LocalDate.of(2030, 10, 10);
        LocalDate plusDate = currentDate.plus(period);

        System.out.println("\ncurrentDate = " + currentDate);
        System.out.println("plusDate = " + plusDate);

        // 기간 차이
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 3, 2);
        Period betweenDate = Period.between(startDate, endDate);
        System.out.println("\nbetweenDate = " + betweenDate); // P2M1D 기간 차이
        System.out.println("betweenDate.getMonths() / betweenDate.getDays() = " + betweenDate.getMonths() + betweenDate.getDays());
    }
}
