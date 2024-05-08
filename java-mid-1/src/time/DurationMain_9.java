package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain_9 {
    public static void main(String[] args) {
        Duration durationTime = Duration.ofMinutes(30);
        System.out.println("\ndurationTime = " + durationTime);

        LocalTime initLt = LocalTime.of(1, 0);
        System.out.println("\ninitLt = " + initLt);
        // 계산에 사용
        LocalTime plusTime = initLt.plus(durationTime);
        System.out.println("init + DurationTime = " + plusTime);

        // 시간 차이
        LocalTime stTime = LocalTime.of(9, 0);
        LocalTime edTime = LocalTime.of(10, 15);
        Duration betweenTime = Duration.between(stTime, edTime);
        System.out.println("\nbetweenTime = " + betweenTime);
        System.out.println("차이 : betweenTime.getSeconds() = " + betweenTime.getSeconds());
        System.out.println("근무 시간 / 근무 분 : betweenTime.toHours() / betweenTime.toMinutes() = " + betweenTime.toHours() + "/" + betweenTime.toMinutes());
        System.out.println("시간을 뺀 남은 부분 : betweenTime.toMinutesPart() = " + betweenTime.toMinutesPart());


    }
}
