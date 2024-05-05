package enumeration.ref1;

public class DiscountService_Enum_2 {
    public int discount(classGradeEnum_1 classGradeEnum, int price) {
        /*
        int discountPercent = 0;

        if (classGradeEnum == classGradeEnum_1.BASIC) {
            discountPercent = 10;
        } else if (classGradeEnum == classGradeEnum_1.GOLD) {
            discountPercent = 20;
        } else if (classGradeEnum == classGradeEnum_1.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println(" : 할인 X");
        }

        return price * discountPercent / 100;
        */

        /* ENUM 등급에 따라 할인율이 결정되는 로직이
        * ENUM 클래스를 생성과 동시에 사용자가 할인 등급을 파라미터로 결정하므로,
        * IF 문을 통해 추가적으로 값을 재정의할 필요가 없게 되었다.
        *
        * 즉, 해당 클래스에서 값을 조회하는 메서드만 호출하면,
        * 그 이전에 사용하던 값을 정의 하는 추가 로직은 생략할 수 있다.
        * */
        // int discountPercent = classGradeEnum.getDiscountPercent(); // Ctrl + Alt + V
        /*
        int discountPercent = classGradeEnum.getDiscountPercent(); // Ctrl + Alt + N (Inline Variable)
        return price * classGradeEnum.getDiscountPercent() / 100;
        */

        return price * classGradeEnum.getDiscountPercent() / 100;
    }
}
