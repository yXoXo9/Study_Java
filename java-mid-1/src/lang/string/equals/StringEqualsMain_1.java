package lang.string.equals;

public class StringEqualsMain_1 {
    public static void main(String[] args) {
        String hello1 = new String("Hello");
        String hello2 = new String("Hello");

        System.out.println("hello1 == 비교 : " + (hello1 == hello2));

        // char[] 내부 value 값으로 비교
        System.out.println("new Stirng() equals 비교 : " + (hello1.equals(hello2)));

        String str3 = "literalString";
        String str4 = "literalString";
        System.out.println("리터럴 == 비교 : " + (str3 == str4));
        System.out.println("리터럴 .equals 비교 : " + (str3.equals(str4)));
    }
}
