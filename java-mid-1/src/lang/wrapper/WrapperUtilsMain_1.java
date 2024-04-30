package lang.wrapper;

public class WrapperUtilsMain_1 {
    public static void main(String[] args) {
        Integer inte = Integer.valueOf(100);// 숫자를, 숫자 래퍼 객체 변환
        Integer inte2 = Integer.valueOf("10");// 문자를, 숫자 래퍼 객체 변환
        int intPrimitive = Integer.parseInt("500");// 문자열전용 메서드, 숫자 기본형 변환

        /*
        * parseInt() vs valueOf()
        * parseInt() : 기본형으로 반환 (문자열만 지원)
        * valueOf() : 래퍼 타입으로 반환 (숫자, 문자열 모두 지원)
        * 각 타입에 parseXxx() 가 존재한다.
        * */

        // 비교 compareTo() 크면 1, 같으면 0, 작으면 -1
        int iComp = inte.compareTo(30); // result : 1
        System.out.println("compareResult = " + iComp);

        // 산술 연산 - static 메서드
        System.out.println("sum = " + Integer.sum(10, 20));
        System.out.println("min = " + Integer.min(10, 20));
        System.out.println("max = " + Integer.max(10, 20));

        /*
        * 래퍼 클래스는 객체로서 다양한 기능, 메서드를 제공한다.
        * 그렇다면 래퍼 크래스만 쓰면 되는것 아닌가....?
        *
        * 성능 차이를 확인해보자.
        * */
    }
}
