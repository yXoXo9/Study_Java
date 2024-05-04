package enumeration.ex3;

public class DiscountService_Enum {
    /*
    * 문자가 아닌 Grade 이라는 타입으로 (타입 안전 열거형)
    * 파라미터를 받는다.
    * */
    public int discount(Grade classGradeEnum, int price) {
        int discountPercent = 0;

        if (classGradeEnum == Grade.BASIC) {
            discountPercent = 10;
        } else if (classGradeEnum == Grade.GOLD) {
            discountPercent = 20;
        } else if (classGradeEnum == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println(" : 할인 X");
        }

        return price * discountPercent / 100;
    }
}
