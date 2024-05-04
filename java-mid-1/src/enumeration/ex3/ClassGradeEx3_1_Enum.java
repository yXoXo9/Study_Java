package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class ClassGradeEx3_1_Enum {
    public static void main(String[] args) {
        System.out.println("-Grade. Enum 사용-");
        System.out.println();

        extracted();
        System.out.println();

        extracted1();
        System.out.println();
        /*
        * 자바에서 해당 패턴을 더욱 편리하게 구현하기 위해
        * Enum 타입의 클래스를 제공한다. - ex3. Grade
        * */

        extracted2();
        /*
        * 열거형(ENUM)의 장점
        * 1. 타입 안전성 향상 : 사전 정의된 열거형 상수들로만 구성되므로
        * 개발자가 정의한 범위 내에서 값을 입력 받을 수 있다.
        *
        * 2. 간결성 및 일관성 : 이로 인해 코드가 더 간결, 명확해지며 데이터의 일관성까지 보장된다.
        *
        * 3. 확장성 : 새로운 데이터를 추가할 시 ENUM 에 새로운 상수를 추가하기만 하면 된다.
        * 물론 비즈니스 로직은 수정해야한다.
        */

        /*
        * +a enum 클래스를 static import 하여 가독성을 더욱 높일 수 있다.
        * import static enumeration.ex3.Grade.*;
        * 를 통해
        * Grade.GOLD = > GOLD 로 바로 사용
        * */

    }

    private static void extracted2() {
        int pr = 30_000;
        DiscountService_Enum discountServiceEnum = new DiscountService_Enum();

        // Enum 은 인스턴스로 생성 불가
        // Grade grade = new Grade(); // Enum types cannot be instantiated
    }

    private static void extracted1() {
        int pr = 10_000;
        DiscountService_Enum discountServiceEnum = new DiscountService_Enum();
        int discountResult = discountServiceEnum.discount(GOLD, pr);
        System.out.println("newClassGrade 등급의 할인 금액 : " + discountResult);
    }

    private static void extracted() {
        int pr = 10_000;
        DiscountService_Enum discountServiceEnum = new DiscountService_Enum();
        int basic = discountServiceEnum.discount(BASIC, pr);
        int gold = discountServiceEnum.discount(GOLD, pr);
        int diamond = discountServiceEnum.discount(DIAMOND, pr);

        System.out.println("basic 의 할인 금액 : " + basic);
        System.out.println("gold 의 할인 금액 : " + gold);
        System.out.println("diamond 의 할인 금액 : " + diamond);
    }
}
