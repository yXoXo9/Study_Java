package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " Java";

        String re1 = a.concat(b);
        String re2 = a + b;

        /*
        * 참조값 임에도 불구하고 더하기(+)가 된다...?
        * 너무 자주 다루어지기 때문에 자바 언어에서 편의상 특별히 + 연산을 제공한다.
        * */
        System.out.println("re1 = " + re1);
        System.out.println("re2 = " + re2);
    }
}
