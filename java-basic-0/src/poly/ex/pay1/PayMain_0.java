package poly.ex.pay1;

public class PayMain_0 {
    public static void main(String[] args) {
        /*
        * M: 현재 2가지 결제수단 지원 중
        * 앞으로 5개의 결제 수단을 추가로 지원할 예정,
        * 새로운 결제수단을 쉽게 추가할 수 있도록, 기존 코드를 리팩토링
        *
        * 1. OCP 원칙을 지킬것,
        * 2. 메서드를 포함한 모든 코드를 변경 가능, 클래스 OR 인터페이스 추가 가능
        * 3. 프로그램을 실행하는 PayMain0 코드는 변경하지 않고, 그대로 유지해야 한다.
        * 4. 리팩토링 후 실행 결과는 기존과 같아야 한다.
        * */

        PayService payService = new PayService();

        // kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        // naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        // 잘못된 결제 수단 선택 결제
        String payOption3 = "wrong";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);

        // 잘못된 결제 수단 선택 결제
        String payOption4 = "new";
        int amount4 = 30000;
        payService.processPay(payOption4, amount4);

    }
}
