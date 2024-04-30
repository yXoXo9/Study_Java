package lang.wrapper;

public class AutoboxingMain_1 {
    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        // Wrapper -> Primitive - unBoxing
        int unBoxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println();
        System.out.println("unBoxedValue = " + unBoxedValue);

    /*  auto boxing & auto unBoxing
        - Java 1.5 부터 ... 지원
        생각보다 너무 자주 발생하는 박싱, 언박싱 상황
    */

        //Primitive -> Wrapper
        int autoValue = 7;
        Integer autoBoxedValue = autoValue;

        // Wrapper -> Primitive - unBoxing
        int autoUnBoxedValue = autoBoxedValue;

        /*
        * 컴파일러가 valueOf, xxxValue() 등의 코드를 자동으로 추가, 적용해준다.
        * 이를 통해 기본형과 래퍼형을 서로 개발자 선언이 필요 없이 변환할 수 있다.
        * */
        System.out.println("autoBoxedValue = " + autoBoxedValue);
        System.out.println();
        System.out.println("autoUnBoxedValue = " + autoUnBoxedValue);

    }
}
