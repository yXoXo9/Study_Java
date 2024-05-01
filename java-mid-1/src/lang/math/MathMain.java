package lang.math;

public class MathMain {
    public static void main(String[] args) {
        extracted();
        System.out.println();

        extracted1();
        System.out.println();

        extracted2();
        System.out.println();
    }

    private static void extracted2() {
        // 기타 유용한 메서드
        System.out.println("Math.sqrt(4) = " + Math.sqrt(4));   // 제곱근 2.0
        System.out.println("Math.random() = " + Math.random()); // 0.0 ~ 1.0 사이의 double 값 ... 0.8628557646221843
    }

    private static void extracted1() {
        // 반올림 및 정밀도 메서드
        System.out.println("Math.ceil(2.1) = " + Math.ceil(2.1));   // 올림 : 3.0
        System.out.println("Math.floor(2.1) = " + Math.floor(2.1)); // 내림 : 2.0
        System.out.println("Math.round(2.5) = " + Math.round(2.5)); // 반올림 : 3

        // 아주 정밀한 숫자 반올림 계산이 필요 시 BigDecimal 을 검색하여 사용
    }

    private static void extracted() {
        // 기본 연산 메서드
        System.out.println("Math.max(10,20) = " + Math.max(10, 20)); // 최대 값 : 20
        System.out.println("Math.min(10,20) = " + Math.min(10, 20)); // 최소 값 : 10
        System.out.println("Math.abs(-10) = " + Math.abs(-10)); // 절대 값 : 10
    }
}
