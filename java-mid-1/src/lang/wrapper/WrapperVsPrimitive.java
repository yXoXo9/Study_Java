package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        // 자바에서 _언더스코어를 통해 , 자릿수 나눔 표시 허용
        int iterations = 1_000_000_000; // 반복 횟수를 설정, 10억
        long startTime, endTiem;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis(); // 시작 = 현재시간

        // 10억번 반복
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTiem = System.currentTimeMillis();

        System.out.println("sumPrimitive = " + sumPrimitive); // 300ms => 0.3초
        System.out.println("기본 자료형 long 실행 시간 : " + (endTiem - startTime) + "ms");

        // long Wrapper Class 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis(); // 시작 = 현재시간

        // 10억번 반복
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }
        endTiem = System.currentTimeMillis();

        System.out.println("sumWrapper = " + sumWrapper); // 3442ms => 3.4초
        System.out.println("Long Wrapper 형 실행 시간 : " + (endTiem - startTime) + "ms");

        /*
        * 기본형은 단순히 그 크기만큼의 공간을 차지 한다. ex) int = 4byte
        * 래퍼 클래스의 인스턴스는 기본형 메모리 뿐만 아니라 객체 자체를 다루는데 필요한
        * 객체 메타 데이터를 포함하여 메모리를 더 많이 사용한다.
        * 자바 버전과 시스템마다 다르지만
        * 대략 8~16 바이트의 메모리를 추가로 사용한다.
        * */

        /*
        * 중요하게 생각할 점은
        * 일반적인 애플리케이션 만드는 관점에서 볼 때
        * 이런 부분을 최적화해도 사막의 모래알 하나 정도의 차이가 날 뿐이다...
        * 0.3초 나누기 10억, 3.4초 나누기 10억..
        * 즉,
        * CPU 연산을 아주 많이 수행하는 특수한 경우이거나,
        * 수만 ~ 수십만 이상 연속해서 연산을 수행해야 하는 경우라면, 기본형을 사용해 최적화를 고려하고
        *
        * 그렇지 않은 일반적인 경우라면 코드를 유지보수하기 더 나은 것을 선택하면 된다.
        *
        * 개발자가 처한 상황, 로직을 수행하는 상황에서 (배치 프로그램 등)
        * 좀 더 효율적인 작업방향을 고려해 선택하는 것이 좋다. ( 유지보수 하기 더 좋은 소스 방향 )
        * */

        /*
        * 유지보수 vs 최적화
        * 지금은 유지보수 하기 좋은 코드를 먼저 고민하는 것이 좋다.
        *
        * 코드 변경 없이 성능 최적화를 하면 가장 좋겠지만,
        * 대부분 최적화를 위한 복잡함을 요구하고, 더 많은 코드를 추가로 생성해야한다.
        * => 최적화를 위한 코드가 늘어남으로 유지보수 해야 하는 소스 및 범위가 늘어나는 것,
        * ===>  모래알 하나를 정리하기 위해 더 많은양의 소스를 만들고 작업 범위를 늘리는 것은,
        *       그만한 가치가 있는 것인지 판단하는 것이 중요 (유지보수 입장에선 복잡성으로 인한 불필요한 코드...)
        *
        * 웹 애플리케이션의 경우 메모리 안에서 발생하는 연산보다,
        * 네트워크 호출 한번이 많게는 수십만배 더 오래 걸린다.
        * => 자바 내부에서 발생하는 수천번의 연산을 한번으로 줄이는 것 보다,
        *    네트워크 호출 한번을 더 줄이는 것이 더 효과적인 경우가 많다.
        *
        * ==> 초기 개발에는 유지보수하기 편한 코드로 먼저 개발한 다음,
        *     이후 성능 테스트를 진행하여 '정말 문제'가되는 부분을 찾아서 최적화 하는 것.
        *
        * !! 쓸데 없는 최적화는 되도록 피하자 !!
        *
        * */
    }
}
