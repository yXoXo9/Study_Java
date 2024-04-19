package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유한다.

        Address a = new Address("서울");
        Address b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b.setValue("부산");
        // System.out.println("부산 -> b");
        chg(b, "부산");
        System.out.println("a = " + a); // 사이드 이펙트 발생
        System.out.println("b = " + b);
    }

    public static void chg(Address a, String b){
        System.out.println("주소 값 변경 - > " + b);
        a.setValue(b);
    }
}
