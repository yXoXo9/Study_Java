package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long stTime = System.currentTimeMillis();
        // String result = "";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            // result += "Hello Java";
            result.append("Hello Java");
        }
        long edTime = System.currentTimeMillis();

        /* String = stTime - edTime = [6179]ms 6.179 초 */
        // System.out.println("result = " + result);
        // System.out.println("stTime - edTime = [" + (edTime - stTime) + "]ms");

        System.out.println("result = " + result);
        System.out.println("stTime - edTime = [" + (edTime - stTime) + "]ms // 1ms = 0.001 seconds");

        /*
        *  ! StringBuilder 를 직접 사용하는 것이 좋은 경우 !
        *
        *  반복문에서 반복 문자 연결 시 (10, 20번 도는 정도는 그냥 ...)
        *  (문자 길이가 크거나, 천번 이상 많이 돌 경우엔 고려하는 것이 좋다)
        *  조건문을 통해 동적으로 문자열 조합 시
        *  복잡한 문자열의 특정 부분 변경 시
        * 매우 긴 대용량 문자열을 다룰 때
        *
        * String Builder vs Buffer
        *
        * Buffer : 내부 로직의 동기화로 인해 멀티 스레드 환경에는 안전하지만,
        * (인스턴스에 동시에 접근하거나 메서드를 호출하는 등 다중 처리 상황을 제한)
        * 동기화 오버헤드로 인해 성능이 느리다.
        * ==> 멀티스레드 트랜잭션 시 버퍼를 할당(동기화)하여 순서를 정리함
        * 버퍼는 거의 사용하지 않음 (특수한 경우에만 사용)
        *
        * Builder : 멀티 스레드 환경에 안전하지 않음,
        * 오버헤드가 없으므로 속도는 빠르다. (일반적으로 사용)
        *
        * */
    }
}
