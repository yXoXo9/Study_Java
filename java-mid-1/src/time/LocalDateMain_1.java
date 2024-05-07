package time;

import java.time.LocalDate;

public class LocalDateMain_1 {
    public static void main(String[] args) {
        /*
        * now() : 현재 시간을 기준으로 생성
        * of(...) : 특정 날짜를 기준으로 생성, 년, 월, 일 입력 가능
        *
        * 계산 ... 여러 가지가 존재
        * plusDays() : 특정 일 add plus???() 메서드 존재
        * */
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜 : " + nowDate);

        LocalDate ofDate = LocalDate.of(2021, 11, 12);
        System.out.println("지정 날짜 : " + ofDate);

        // 날짜 계산 주의 (불변객체)
        System.out.println("지정 날짜 + 10d : " + ofDate.plusDays(10));

        LocalDate localDate = ofDate.plusDays(20);
        System.out.println("지정 날짜 + 20d : " + localDate);
    }
}
