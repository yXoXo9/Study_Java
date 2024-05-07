package time;

import java.time.LocalTime;

public class LocalTimeMain_2 {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println("현재 시간 = " + nowTime);

        // Invalid value for HourOfDay (valid values 0 - 23): 25
        // LocalTime ofTime = LocalTime.of(25, 10, 45);
        LocalTime ofTime = LocalTime.of(23, 10, 45);
        System.out.println("지정 시간 = " + ofTime);

        // 계산 (불변)
        LocalTime ofTimePlusSeconds = ofTime.plusSeconds(99);
        System.out.println("지정 시간 + 99s = " + ofTimePlusSeconds);
    }
}
