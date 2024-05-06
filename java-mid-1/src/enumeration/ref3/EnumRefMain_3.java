package enumeration.ref3;

public class EnumRefMain_3 {
    public static void main(String[] args) {
        extracted();
        System.out.println();

        extracted1();
        System.out.println();

        extracted2();
        System.out.println();
    }

    private static void extracted2() {
        System.out.println("BASIC = " + refValue(enumeration.ref2.Grade.BASIC));
        System.out.println("GOLD = " + refValue(enumeration.ref2.Grade.GOLD));
        System.out.println("DIAMOND = " + refValue(enumeration.ref2.Grade.DIAMOND));
        /*
        BASIC = 1d81eb93
        GOLD = 7291c18f
        DIAMOND = 34a245ab
        */
    }

    private static String refValue(Object grade){
        /* 객체의 참조값 (System.identityHashCode) 을
        * 16진수로 (Integer.toHexString) 변경하여
        * 화면에 출력한다.
        * */
        return Integer.toHexString(System.identityHashCode(grade));
        /*
        * System.identityHashCode : 자바에서 관리하는 객체의 참조값을 숫자로 반환
        * Integer.toHexString : 반환된 숫자를 16진수로 변환(개발자가 보통 확인하는 참조 값 형태)
        * */
    }

    private static void extracted1() {
        System.out.println("ref BASIC = " + enumeration.ref2.Grade.BASIC);
        // ref BASIC = BASIC
        // 객체의 참조값을 보고 싶지만... enum 타입은 toStrong()을 자동으로 오버라이딩
    }

    private static void extracted() {
        System.out.println("class BASIC = " + enumeration.ref2.Grade.BASIC.getClass());
        System.out.println("class GOLD = " + enumeration.ref2.Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());
        /*
        class BASIC = class Grade
        class GOLD = class Grade
        class DIAMOND = class Grade
        * */
    }
}
