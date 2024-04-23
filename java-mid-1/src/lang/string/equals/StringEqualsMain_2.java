package lang.string.equals;

public class StringEqualsMain_2 {
    public static void main(String[] args) {
        String hello1 = new String("Hello");
        String hello2 = new String("Hello");
        System.out.println("메서드 호출 비교 1 = " + isSame(hello1, hello2));

        String hello3 = "Hello";
        String hello4 = "Hello";
        System.out.println("메서드 호출 비교 3 = " + isSame(hello3, hello4));

    }

    private static boolean isSame(String x, String y){
        /* 메서드를 제작하는 개발자 입장에서
        * String 이 들어오는 경우 참조형인지 기본형인지 알 수 없다.
        * 즉, 동등성 피교인지 동일성 비교인지 확실하게 처리해야 한다.
        * 아니면,
        * 문자열 비교는 기본적으로 항상 equals 를 사용해야 한다.
        * */
        return x == y;
    }
}
