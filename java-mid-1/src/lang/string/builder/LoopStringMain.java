package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long stTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java";
            /* result =
                new StringBuilder()
                    .append(result)
                        .append("Hello Java ")
                            .toString();
             => 최적화 되는 것 처럼 보이지만,
             반복 횟수만큼 객체를 생성해야 하는 상황이 발생,

             컴파일러는 문자열이 어떻게 변할지 예측할 수 없다.
             => 최적화가 어려움
             ===> 위의 경우 반복 횟수
             100,000번 가량의 String 객체를 생성했을 것
            */
        }
        long edTime = System.currentTimeMillis();
        /* stTime - edTime = [6179]ms 6.179 초 */
        System.out.println("result = " + result);
        System.out.println("stTime - edTime = [" + (edTime - stTime) + "]ms");
    }
}
