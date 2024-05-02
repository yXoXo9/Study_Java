
package enumeration.ex1;

public class DiscountService {

    public int discount(String grade, int price){
        int discountPercent = 0;
        /*
        * Basic - 10%, Gold - 20%, Diamond - 30% 할인 비율 적용하여
        * 상품 구매 시 등급별 할인을 적용한다.
        * 소수점 이하는 버림
        * */

        /* 상수 적용 */
        if(grade.equals(StringGrade.BASIC)){
            discountPercent = 10;
        }else if (grade.equals(StringGrade.GOLD)){
            discountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercent = 30;
        } else{
            System.out.println(grade + ": 할인 X");
        }

        return price * discountPercent / 100;
    }
}
