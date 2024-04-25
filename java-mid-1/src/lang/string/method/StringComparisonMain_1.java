package lang.string.method;

public class StringComparisonMain_1 {
    public static void main(String[] args) {
        String str1 = "Hello, Java~"; // 대문자 일부
        String str2 = "hello, java~"; // 대문자 없음
        String str3 = "Hello, World!";

        System.out.println("st1 equals st2: " + str1.equals(str2));
        System.out.println("st1 equalsIgnoreCase st2: " + str1.equalsIgnoreCase(str2));

        // 사전적으로 비교 후 순서 반환
        System.out.println("'b' compareTo 'a' : " + "b".compareTo("a"));
        System.out.println("'a' compareTo 'b' : " + "a".compareTo("b"));
        System.out.println("'b' compareTo 'y' : " + "b".compareTo("y"));

    }
}
