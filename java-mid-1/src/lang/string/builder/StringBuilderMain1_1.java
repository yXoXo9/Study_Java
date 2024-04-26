package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        /* 가변형 String 사용 */
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(2, "insertJava");
        System.out.println("afterInsert sb(2) = " + sb);

        sb.delete(2, 6);
        System.out.println("afterDelete sb(2, 6) = " + sb);

        sb.reverse();
        System.out.println("reverse_sb = " + sb);

        // StringBuilder -> String 변환 (불변)
        String str = sb.toString();
        System.out.println("str = " + str);

        /*
        * StringBuilder 를 통해
        * String 에 대한 변경이 자주 발생할 때 주로 사용한 다음,
        * 최종 혹은 변경이 마무리 되는 시점에 String 불변 객체로 변경하는 것이
        * 의도하지 않은 사이드 이팩트를 방지할 수 있다. (좋은 습관)
        * */

        /*
        * 자바 컴파일러는,
        * 문자열 리터럴을 합칠경우 자동으로 붙여준다.
        *
        * before Compile
        * => String hell = "hello, " + "World";
        *
        * after Compile
        * => String hell = "hello, World";
        *
        * 이를 통해 런타임 시 별도로 결합 연산을 수행하지 않고
        * 성능이 향상된다.
        * */
    }
}
