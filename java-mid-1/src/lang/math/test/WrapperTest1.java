package lang.math.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        extracted();
        System.out.println();

        extracted1();
        System.out.println();

        unUseAutoBox();
        System.out.println();

        useAutoBox();
        System.out.println();

    }

    private static void useAutoBox() {
        /*
         * 박싱, 언박싱
         * String str => Integer 변환 출력
         * Integer 를 int 변환 출력
         * int 를 Integer 변환 출력
         * 오토 박싱, 오토 언박싱을 사용하여 변환 한다.
         * */
        System.out.println("- Auto -");
        String str = "100";
        Integer strOfInteger = Integer.valueOf(str);
        System.out.println("Integer_integer1 = " + strOfInteger);

        // Integer.parseInt(strOfInteger); // String => int
        int getInt = strOfInteger;
        System.out.println("int_intValue = " + getInt);

        Integer getInteger2 = getInt;
        System.out.println("getInteger2 = " + getInteger2);
    }

    private static void unUseAutoBox() {
        /*
        * 박싱, 언박싱
        * String str => Integer 변환 출력
        * Integer 를 int 변환 출력
        * int 를 Integer 변환 출력
        * 오토 박싱, 오토 언박싱을 사용하지 말고 직접 변환해야 한다.
        * */

        String str = "100";
        Integer strOfInteger = Integer.valueOf(str);
        System.out.println("Integer_integer1 = " + strOfInteger);

        // Integer.parseInt(strOfInteger); // String => int
        int getInt = strOfInteger.intValue(); // auto unboxing 으로 인한 삭제 추천
        System.out.println("int_intValue = " + getInt);

        /*Integer getInteger = new Integer(getInt); // auto boxing 으로 인한 삭제 추천 (미래에 없어질 예정)
        System.out.println("int_To_Integer_integer2 = " + getInteger);*/

        Integer getInteger2 = Integer.valueOf(getInt); // auto boxing 으로 인한 삭제 추천
        System.out.println("getInteger2 = " + getInteger2);
    }

    private static void extracted1() {
        /*
        * parseDouble()
        * 배열에 입력된 모든 숫자의 합, double 형이 입력될 수 있다.
        * */
        String[] arr = {"1.5","2.5","3.0"};
        double dSum = 0.0;

        for (String s : arr){
            dSum += Double.parseDouble(s);
        }
        System.out.println("dSum = " + dSum);
    }

    private static void extracted() {
        /*
        * str1, str2 두 수의 합
        * */
        String str1 = "10";
        String str2 = "20";

        System.out.println(str1 + str2); // 1020

        // Integer wrapper 타입을 통한 auto unboxing 으로 + 연산 수행
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2)); // 30

        // String 문자열을 int (기본형)으로 처리후 + 연산 수행
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); // 30
    }
}
