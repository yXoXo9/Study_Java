package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain_5 {
    public static void main(String[] args) {

        Grade[] values = getGrades();
        System.out.println();

        extracted(values);
        System.out.println();

        extracted();
        System.out.println();


    }

    private static void extracted() {
        // String 을 Enum 으로 변환
        String inputEnum = "GOLD";
        Grade inputGold = Grade.valueOf(inputEnum);
        System.out.println("inputGold = " + inputGold); // => toString() 오버라이딩 가능

        /* 열거형에 포함되지 않는 스트링 입력 시 에러 발생
        (Error) java.lang.IllegalArgumentException: No enum constant

        Grade wrongGold = Grade.valueOf("gold");
        System.out.println("wrongGold = " + wrongGold);
        */
    }

    private static void extracted(Grade[] values) {
        // 모든 Enum 반환
        System.out.println("values = " + Arrays.toString(values));

        for (Grade value : values) {
            System.out.println("value.name = " + value.name()
                    // 순서 반환 ( Enum 클래스에 상수를 선언한 순서를 반환 )
                + " // ordinal = " + value.ordinal());

            // ordinal() 은 가급적 사용하지 않는 것이 좋다.
            // => 상수를 선언하는 위치가 변경될 시 전체 상수 위치가 모두 변경될 수 있다.
        }
    }

    private static Grade[] getGrades() {
        Grade[] values = Grade.values();
        // values 변수의 참조 값
        System.out.println("values = " + values);
        return values;
    }
}
