package lang.string.method;

public class StringUtilsMain_2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";
        
        // format Method
        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println("form1 = " + format1);

        String format2 = String.format("숫자 : %.2f", 10.12345);
        System.out.println("format2 = " + format2);

        // printf
        System.out.printf("숫자(.5f): %.5f\n", 10.12345678);

        // matches Method
        // str = "Hello, Java!";
        String regex = "Hello, (Java!|World)"; // Java! or World 가 매칭되는가
        System.out.println("'str' 이 패턴과 일치 하는가? str.matches(regex) = \n" + str.matches(regex));
    }
}
