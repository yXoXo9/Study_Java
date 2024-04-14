package other_forJava;

import java.util.Map;

public class Scope3_1 {
    static int gIntTest = 100;
    static String gString = null;
    static Map<Object, Object> gObject;
    public int gPublicInt = 100;
    public String gPublicString = null;
    public Map<Object, Object> gPublicObject;
    // (1)....

    /*
     * 무분별한 스코프의 변수 사용으로 인한 문제
     * 1. 선언된 변수가 포함된 코드 블록의 종료될 때까지 메모리에 유지됨
     *
     *  => 비효율적인 메모리 사용
     *
     * 2. 스코프가 불필요하게 넓은 변수가 사용된 레거시 소스는
     * 가독성도 떨어지고,
     * 생각해야될 문제를 증가시킨다.
     *
     *  => 코드 복잡성 증가
     *  => 실무 프로젝트는 라인 수가 엄청 많음 (한눈에 파악하기 매우 어려움)
     */

    public static void main(String[] args) {
//        int m = 10;
//        int temp = 0; // (2)... if 안에서만 쓰는 변수
//        if (m > 0) {
//            temp = m * 2;
//            System.out.println("temp = " + temp);
//        }
//        System.out.println("m = " + m);
//        -- before

        int m = 10;
        if (m > 0) {
            int temp = m * 2; // (2) 개선 => 생각 범위 자체도 줄어들고, 효율적인 메모리 사용
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
