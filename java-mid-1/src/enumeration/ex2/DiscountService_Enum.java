package enumeration.ex2;

public class DiscountService_Enum {
    /*
    * 문자가 아닌 ClassGradeEnum 이라는 타입으로 (타입 안전 열거형)
    * 파라미터를 받는다.
    * */
    public int discount(classGradeEnum classGradeEnum, int price) {
        int discountPercent = 0;

        if (classGradeEnum == enumeration.ex2.classGradeEnum.BASIC) {
            discountPercent = 10;
        } else if (classGradeEnum == enumeration.ex2.classGradeEnum.GOLD) {
            discountPercent = 20;
        } else if (classGradeEnum == enumeration.ex2.classGradeEnum.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println(" : 할인 X");
        }

        return price * discountPercent / 100;
    }
}
