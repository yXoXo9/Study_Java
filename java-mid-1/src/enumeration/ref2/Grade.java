package enumeration.ref2;

import enumeration.ref1.classGradeEnum_1;

public enum Grade {
    /* 열거형 변수 선언의 끝 */
    BASIC(10), GOLD(20), DIAMOND(30);

    // 인스턴스 선언 문법이 생략된 ENUM 형태
    // public static final classGradeEnum_1 BASIC = new classGradeEnum_1(10);
    // => BASIC(10)
    // public static final classGradeEnum_1 GOLD = new classGradeEnum_1(20);
    // public static final classGradeEnum_1 DIAMOND = new classGradeEnum_1(30);

    private final int discountPercent;

    // 얼거형은 상수 지정 외에 일반적인 방법으론 생성이 불가능,
    // 따라서 접근제어자 또한 private (생략가능)
    Grade(int discountPercent){
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
