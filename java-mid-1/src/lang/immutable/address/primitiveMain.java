package lang.immutable.address;

public class primitiveMain {

    public static void main(String[] args) {
        // 기본형은 보이는 값을 전달만 한다.

        int a = 10;
        int b = a; // a -> b, 값 대입

        System.out.println("a = " + a); // !!a, b 의 메모리 위치는 서로 다르다!!
        System.out.println("b = " + b); // !!a, b 의 메모리 위치는 서로 다르다!!

        b =  20;
        /* 기본형 변수는 하나의 값을 절대로 공유하지 않는다. */
        System.out.println("20 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
