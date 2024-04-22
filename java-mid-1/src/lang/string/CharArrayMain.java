package lang.string;

public class CharArrayMain {

    public static void main(String[] args) {
        /* String 클래스, 문자 클래스 */

        char a = '가';
        System.out.println("a = " + a);

        char[] charArr = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(charArr);

        /* 문자열을 다루는 두가지 방법,,
         char[] 는 매우 불편
        * */
        String str = "hello";
        System.out.println("str = " + str);

    }
}
