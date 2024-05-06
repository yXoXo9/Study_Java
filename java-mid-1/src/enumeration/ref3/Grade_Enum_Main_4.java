package enumeration.ref3;

import static enumeration.ref3.Grade.*;

public class Grade_Enum_Main_4 {
    public static void main(String[] args) {
        System.out.println("-Grade. Enum 사용-\n");
        extracted();
        System.out.println();

        extracted1();
        System.out.println();
    }
    private static void extracted1() {
        int pr = 10_000;
        DiscountService_Enum_2 discountServiceEnum = new DiscountService_Enum_2();
        int discountResult = discountServiceEnum.discount(GOLD, pr);
        System.out.println("newClassGrade 등급의 할인 금액 : " + discountResult);
    }

    private static void extracted() {
        int pr = 10_000;
        DiscountService_Enum_2 discountServiceEnum = new DiscountService_Enum_2();
        int basic = discountServiceEnum.discount(BASIC, pr);
        int gold = discountServiceEnum.discount(GOLD, pr);
        int diamond = discountServiceEnum.discount(DIAMOND, pr);

        System.out.println("BASIC 의 할인 금액 : " + basic);
        System.out.println("GOLD 의 할인 금액 : " + gold);
        System.out.println("DIAMOND 의 할인 금액 : " + diamond);
    }
}
