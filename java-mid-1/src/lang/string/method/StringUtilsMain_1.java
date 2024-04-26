package lang.string.method;

public class StringUtilsMain_1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, java!";

        // valueOf Method
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 numString = " + numString);
        String boolString = String.valueOf(bool);
        System.out.println("불리언의 문자열 boolString = " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("오프젝트의 문자열 numString = " + objString);

        // 문자, 숫자 결합 => String
        String numStr = "" + num;
        System.out.println("빈 문자 + num : " + numStr);

        // toCharArray Method
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환 : ");
        for (char c : strCharArray){
            System.out.print(c + " ");
        }


    }
}
