package enumeration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        extracted();
        System.out.println();

        /*
        * !! 등급(특정 기준 값)에 ' 문자열을 사용하는 방식은 ' !!
        * 1. 타입 안정성 부족 : 문자열 허용 범위에 대한 제한이 없으므로 오타 발생 및 유효하지 않은 값이 입력가능
        * 2. 데이터 일관성 : 다양한 형식으로 문자열이 입력됨으로 일관성이 떨어진다.
        *
        * String 사용 시 타입 안정성 부족
        * 1. 값의 제한 부족, 2. 컴파일 시 오류 감지 불가
        *
        * ==> 특정 범위로 값을 제한해야 한다.
        * ====> 상수를 써서 수행하면....?
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

        // 오타
        int xmlT = discountService.discount("xmlT", pr);
        System.out.println("xmlT 등급의 할인 금액 : " + xmlT);

        // 소문자
        int diamond = discountService.discount("diamond", pr);
        System.out.println("diamond 등급의 할인 금액 : " + vip);
    }

    private static void extracted() {
        int pr = 10_000;

        /*
         * 오타가 발생하기 쉽고, 유효한 값이 들어오지 않을 확률이 매우 높음
         * */
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC", pr);
        int gold = discountService.discount("GOLD", pr);
        int diamond = discountService.discount("DIAMOND", pr);

        System.out.println("BASIC 등급의 할인 금액 : " + basic); // 1000
        System.out.println("GOLD 등급의 할인 금액 : " + gold); // 2000
        System.out.println("DIAMOND 등급의 할인 금액 : " + diamond); // 3000
    }
}
