package enumeration.ref1;

public class classGradeEnum_1 {
    /*
    public static int discount(String grade, int price){
        int discountPercent = 0;

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

        // 메인 서비스 코드를 보면
        // 회원등급(회원등급 클래스)에 따라 할인율이 적용된다.
        // 회원 등급 클래스가 할인율을 가지고 관리하도록 만들어서 코드를 리팩토링 시도해보자.
    }
    */

    public static final classGradeEnum_1 BASIC = new classGradeEnum_1(10);
    public static final classGradeEnum_1 GOLD = new classGradeEnum_1(20);
    public static final classGradeEnum_1 DIAMOND = new classGradeEnum_1(30);

    // 1. 클래스에 의해 결정할 변수를 상수로 설정
    private final int discountPercent;

    // 2. 인스턴스 생성 시, 상수에 초기값을 설정할 수 있도록 생성자를 구현
    private classGradeEnum_1(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    // 2-1. 사용자가 정의한 생성자 오버로딩으로 인해 기본 생성자는 제거
    // private classGradeEnum_1() {}

    // 3. 상수 값을 직접 접근할 수 없으므로(private), getter 생성
    public int getDiscountPercent() {
        return discountPercent;
    }
}
