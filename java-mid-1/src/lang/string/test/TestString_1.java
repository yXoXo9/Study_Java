package lang.string.test;

public class TestString_1 {

    public static void main(String[] args) {
        extracted2();
        System.out.println();

        extracted1();
        System.out.println();

        extracted();
        System.out.println();

        extracted3();
        System.out.println();

        extracted4();
        System.out.println();

        extracted5();
        System.out.println();

        extracted6();
        System.out.println();

        extracted7();
        System.out.println();

        extracted8();
        System.out.println();

        extracted9();
        System.out.println();

        extracted10();
        System.out.println();
    }

    private static void extracted10() {
        /*
        * reverse()
        * */
        String rStr = "Hello java";
        // rStr.reverse(); 스트링에는 없음
        System.out.println("reverse = " + new StringBuilder(rStr).reverse());
    }

    private static void extracted9() {
        /*
        * split 후 join 을 통한 문자열 합치기
        * */
        String target = "apple,banana,mango";
        String[] split = target.split(",");
        for (String s : split) {
            System.out.println("s = " + s);
        }
        //merge
        System.out.println("joined = " + String.join("->", split));
    }

    private static void extracted8() {
        /*
        * split
        * */
        String splitEmail = "hello@test.com";
        String[] split = splitEmail.split("@");
        System.out.println("ID = " + split[0]);
        System.out.println("Domain = " + split[1]);
    }

    private static void extracted7() {
        /*
        * replace
        * from "java", to "jvm"
        * */
        String reInput = "hello java spring jpa java";
        System.out.println("org_reInput = " + reInput);
        System.out.println("chang = "+ reInput.replace("java", "jvm"));
    }

    private static void extracted6() {
        /*
        * 공백제거
        * */
        String whiteStr = "         hi      ";
        System.out.println("org_WhiteStr = " + whiteStr);
        System.out.println("whiteStr_strip = '" + whiteStr.strip() + "'");
        System.out.println("whiteStr_trim = '" + whiteStr.trim() + "'");
    }

    private static void extracted5() {
        /*
        * 검색 count
        * str 에서 key 로 주어지는 문자를 찾고,
        * 해당 문자의 갯수를 출력
        * indexOf 및 반복문 사용
        * */
        String qStr = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = qStr.indexOf(key);
        System.out.println("index = " + index);
        while(index >= 0){
            index = qStr.indexOf(key, index + 1);
            System.out.println("find_index = " + index);
            /* 최종 -1 */
            count++;
        }
        System.out.println("count = " + count);
        /*
        String[] split = qStr.split(key);
        for (String c : split) {
            System.out.println("c = " + c);
        }
        System.out.println("count = " + (qStr.split(key).length -1));
        */
    }

    private static void extracted4() {
        /*
        * indexOf,substring() 조합
        * 파일명과 확장자를 분리해서 출력
        * */
        String tmpStr = "hello.txt";
        String tmpExt = ".txt";
        System.out.println("2_fileName = "+ tmpStr.substring(0, tmpStr.indexOf(tmpExt)));
        System.out.println("2_extName = "+ tmpStr.substring(tmpStr.indexOf(tmpExt)));
    }

    private static void extracted3() {
        /*
        * subString()을 사용해 hello 와 .txt 분리
        * */
        String subStr = "hello.txt";
        /*
        for (String s : subStr.split("\\.")) {
            System.out.println(s);
        }*/
        System.out.println("fileName = " + subStr.substring(0, 5));
        System.out.println("extName = " + subStr.substring(5));
    }

    private static void extracted2() {
        /* startsWith 를 사용한 포함 여부 표시
        * */
        String url = "https://www.test.com";
        boolean b = url.startsWith("https://");
        System.out.println("b = " + b);
    }

    private static void extracted1() {
        /* length()를 사용한 arr 배열의 들어있는 모든 문자열 길이의 합 구하기
        * */
        String[] arr = {"hello", "java", "jvm", "string", "jpa"};
        int length = 0;
        for (String s : arr){
            System.out.println(s + ":" + s.length());
            length += s.length();
        }
        System.out.println("sum = " + length);
    }

    private static void extracted() {
        /*indexOf()
        * str 에서 ...
        * */
        String chkStr = "hello.txt";
        System.out.println("chkStr.indexOf(\".txt\") = " + chkStr.indexOf(".txt"));
    }
}
