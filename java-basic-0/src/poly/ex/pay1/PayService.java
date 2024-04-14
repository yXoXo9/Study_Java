package poly.ex.pay1;

public class PayService {
    public void processPay(String option, int amount){
        /*
        * 1. if else 문 파악 (2가지 기능이 합쳐져 있는 상태)
        * */
        // boolean result = false;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        // 결제를 선택하는 부분,
        // 실제 결제를 하는 부분으로 분리
        // 페이라는 역할에만 의존하도록 코드 리팩토링
        Pay pay = PayStore.findPay(option);
        // if(pay != null) {
        //    result = pay.pay(amount);
        // }
        // => null object 패턴 처리 이로인해 코드 개선 가능
        boolean result = PayStore.findPay(option).pay(amount);
        // PayService 라는 클라이언트는 Pay 인터페이스에만 의존하고 나머지는 수정하지 않음,

        if(result){
            System.out.println("결제가 성공했습니다.");
        }else{
            System.out.println("결제가 실패했습니다.");
        }
    }

    // PayService 가 변경되므로, 또 다른 개념으로 분리(결제수단을 보관하고 관리하는 클래스로 분리)
}
