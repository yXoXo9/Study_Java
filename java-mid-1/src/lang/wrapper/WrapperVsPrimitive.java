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
    }
}
