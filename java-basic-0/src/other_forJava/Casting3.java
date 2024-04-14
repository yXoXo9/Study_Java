package other_forJava;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647 ;     // int MaxValue
        long maxInt_Over = 2147483648L ;    // int MaxValue + 1 (초과)
        int tmpIntValue = 0;

        /* (명시적) 형 변환 (casting)
        형 변환은 변수에 = (대입) 할 때만 발생하는 것.
        ex)
         long tmpInt = 10L;
         int test = 10L; 문법 에러

         long tmpInt = (int) 10
         long tmpInt = 10 => 묵시적 형 변환
         */
        tmpIntValue = (int) maxIntValue;
        System.out.println("maxIntValue (casting) = " + tmpIntValue);

        /* overFlow 발생 - 명시적 형 변환 시 조심
         !!! overFlow 발생 자체가 문제
         즉, 발생 상황을 없애야 하는 것, 막아야하는 것 이다 - 제약을 걸어야 한다.
         발생한 값을 다루려고 시도 것 자체가 잘못된 방향이다.

         여기서는 큰 자료형(컵)의 내용을 작은 자료형(컵) 에 담으려고 한 상태이므로
         작은 자료형을 큰 자료형으로 바꿔 주면 해결됨. => overflow 해결
         */
        tmpIntValue = (int) maxInt_Over;
        // 범위를 초과한 것 => -2147483648 .... (int의 가장 작은 숫자)
        System.out.println("maxInt_Over (casting) =" + tmpIntValue);
    }
}
