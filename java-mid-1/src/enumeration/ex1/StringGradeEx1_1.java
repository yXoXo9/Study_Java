package enumeration.ex1;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        extracted();
        System.out.println();

        /*
        * 하지만 문자열 상수를 사용해도, 지금 문제를 근본적으로 해결할 수 없다.
        * => String 은 어떤 문자열이든 입력 가능
        * 즉, 메서드에 String 타입의 문자를 직접 입력 extracted1() 해도 상관 없다.
        * 메서드 사용을 의도한 방향으로 계획하기 위해서는 올바른 메서드 설계가 중요하다.
        * ==> 타입 안전 열거형 패턴 - Type-Safe Enum Pattern
        * */
        extracted1();
        System.out.println();
    }

    private static void extracted1() {
        int pr = 10_000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 (잘못된) 등급 수행
        int vip = discountService.discount("VIP", pr);
        System.out.println("VIP 등급의 할인 금액 : " + vip);

        // 오타의 경우
        int xmlT = discountService.discount("xmlT", pr);
        System.out.println("xmlT 등급의 할인 금액 : " + xmlT);

        // 소문자
        int diamond = discountService.discount("diamond", pr);
        System.out.println("diamond 등급의 할인 금액 : " + vip);
    }

    private static void extracted() {
        int pr = 10_000;

        /*
         * 문자열 상수를 사용하여
         * 코드가 좀 더 명확해지고
         * discount()에 인자를 잘못 전달하여도
         * StringGrade 에서 정의한 문자열 상수로 인해 컴파일 시점에서 오류가 발생한다.
         * */
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC, pr);
        int gold = discountService.discount(StringGrade.GOLD, pr);
        int diamond = discountService.discount(StringGrade.DIAMOND, pr);

        System.out.println("BASIC 등급의 할인 금액 : " + basic); // 1000
        System.out.println("GOLD 등급의 할인 금액 : " + gold); // 2000
        System.out.println("DIAMOND 등급의 할인 금액 : " + diamond); // 3000
    }
}
