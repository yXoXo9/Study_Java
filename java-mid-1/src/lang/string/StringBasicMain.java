package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        /*
        * String (클래스) 참조값.. 대입인데
        * str1 = "hello" ?
        * */
        String str1 = "hello";
        String refStr = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("refStr = " + refStr);

        /*
        * 자바에서 편의상 쌍 따옴표로 문자열을 감싸면 자바에서 new String("hello")처럼 변경해 줌
        * => 실제론 성능 최적화를 위한 String Constant Pool 에 저장되어 처리 됨
        * */
    }
}
