package enumeration.ex2;

public class ClassGradeEx2_1_Enum {
    public static void main(String[] args) {
        /*
        * 하지만 이 방식도 한계가 존재한다.
        * */
        extracted();
        System.out.println();

        extracted1();
        System.out.println();
        /*
        * 타입 안전 열거형 (Type-Safe Enum-Pattern) 패턴의 장점
        * 타입 안전성 향상 : 정해진 객체만 사용할 수 있기 때문에, 값을 잘못 입력하는 문제를 근본적으로 방지
        * 데이터 일관성 : 정해진 객체만 사용하므로 데이터의 일관성이 보장된다.
        *
        *
        * 타입 안전 열거형 장점 - 디테일한 이유
        * 1. ==> 제한된 인스턴스 생성
        *  : 사전에 정의된 몇 개의 인스턴스만 생성, 이 인스턴스만 사용할 수 있도록 한다.
        * 2. ==> 타입 안전성
        *  : 이 패턴을 통해 잘못된 값이 할당, 사용되는 것을 '컴파일 시점' 에서 방지할 수 있다.
        *
        * 자바에서 해당 패턴을 더욱 편리하게 구현하기 위해
        * Enum 타입의 클래스를 제공한다. - ex3. Grade
        * */
    }

    private static void extracted1() {
        int pr = 10_000;
        DiscountService_Enum discountServiceEnum = new DiscountService_Enum();
        // ClassGradeEnum classGradeEnum = new ClassGradeEnum(); // x004 - public 일 경우

    /*
        private 처리 컴파일 에러 - 이를통해 열거한 항목 상수만 사용할 수 있다.
        ClassGradeEnum classGradeEnum = new ClassGradeEnum(); // x004
        int discountResult = discountServiceEnum.discount(classGradeEnum, pr);
    */
        int discountResult = discountServiceEnum.discount(classGradeEnum.GOLD, pr);

        System.out.println("newClassGrade 등급의 할인 금액 : " + discountResult);
    }

    private static void extracted() {
        int pr = 10_000;
        DiscountService_Enum discountServiceEnum = new DiscountService_Enum();
        int basic = discountServiceEnum.discount(classGradeEnum.BASIC, pr);
        int gold = discountServiceEnum.discount(classGradeEnum.GOLD, pr);
        int diamond = discountServiceEnum.discount(classGradeEnum.DIAMOND, pr);

        System.out.println("basic 의 할인 금액 : " + basic);
        System.out.println("gold 의 할인 금액 : " + gold);
        System.out.println("diamond 의 할인 금액 : " + diamond);
    }
}
