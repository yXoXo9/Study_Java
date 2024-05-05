package enumeration.ref1;

public class ClassGradeRefMain_3 {
    public static void main(String[] args) {
        extracted();
        System.out.println();

        extracted1();
        System.out.println();
    }

    private static void extracted1() {
        int pr = 10_000;
        DiscountService_Enum_2 discountServiceEnum = new DiscountService_Enum_2();
        int discountResult = discountServiceEnum.discount(classGradeEnum_1.GOLD, pr);
        System.out.println("newClassGrade 등급의 할인 금액 : " + discountResult);
    }

    private static void extracted() {
        int pr = 10_000;
        DiscountService_Enum_2 discountServiceEnum = new DiscountService_Enum_2();
        int basic = discountServiceEnum.discount(classGradeEnum_1.BASIC, pr);
        int gold = discountServiceEnum.discount(classGradeEnum_1.GOLD, pr);
        int diamond = discountServiceEnum.discount(classGradeEnum_1.DIAMOND, pr);

        System.out.println("basic 의 할인 금액 : " + basic);
        System.out.println("gold 의 할인 금액 : " + gold);
        System.out.println("diamond 의 할인 금액 : " + diamond);
    }
}
