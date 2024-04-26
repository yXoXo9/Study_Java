package lang.string.method;

public class StringChangeMain_1 {
    public static void main(String[] args) {
    String str = "Hello, java! welcome to java";
        System.out.println("인덱스 7 부터 부분 문자 : " + str.substring(7));
        System.out.println("인덱스 7 부터 12까지 부분 문자 : " + str.substring(7, 12));

        System.out.println("문자열 결합 : " + str.concat("!@!@"));
        /* .... */
    }
}
