package lang.immutable.address;

public class RefMain2_1 {

    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유한다.
        /* => 공유는 허용하나 값을 바꾸면 안되는 경우 불변 객체로 변환
        * */
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조 값 대입을 막는 방법은 없다 (자바에서 대입 허용)

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /* b.setValue("부산"); // b 의 값을 부산으로 변경해야 하는데....?
        * 그러면 새롭게 생성 해야겠다.
        * */
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
