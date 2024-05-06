package enumeration.ref3;

import static enumeration.ref3.Grade.*;

public class Grade_Enum_Main_7 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        int pr = 10_000;

        // Enum 클래스의 불변 변수가 추가 되더라도 전체 요소를 출력할 수 있는
        // 기존 소스에 변함이 없도록 하기위해 코드 개선

        Grade[] values = values();
        for (Grade grade : values) {
            printDiscount(grade, pr);
        }
    }

    private static void printDiscount(Grade grade, int pr){
        System.out.println(grade.name() + " 의 할인 금액 : " + grade.discount(pr));
    }
}
