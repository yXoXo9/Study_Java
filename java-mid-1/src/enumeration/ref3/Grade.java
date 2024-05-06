package enumeration.ref3;

public enum Grade {
    BASIC(10)
    , GOLD(20)
    , DIAMOND(30)
    //, VIP(50);
    ;

    private final int discountPercent;

    Grade(int discountPercent){
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    /*
    이전 DiscountService_... 에서 수행했던
    서비스 로직 ( Grade 의 값을 getter 를 통해 꺼내서 처리하던 내용)

    을 Grade 클래스 안에서 처리하도록 개선.. OOP 방식의 리팩토링 접근
    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
    */

    // 추가
    // 이를통해 Grade 내부에서 discount () 메서드를 통해 할인율을 스스로 계산하여 return 해준다.
    // public int discount(Grade grade, int price) { grade 는 이미 초기 인스턴시 선언시 정해지므로 제거
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
