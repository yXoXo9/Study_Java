package poly.ex.pay_0_edit;

public class PayService {
    public void processPay(String option, int amount){
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        if("kakao".equals(option)) {
            processPayResult(processPayImpl(new KakaoPay(), amount));
        } else if("naver".equals(option)) {
            processPayResult(processPayImpl(new NaverPay(), amount));
        } else if("toss".equals(option)) {
            processPayResult(processPayImpl(new TossPay(), amount));
        } else {
            System.out.println("결제 수단이 없습니다.");
            processPayResult(false);
        }
    }

    private boolean processPayImpl(PaySystem paySystem, int amount) {
        return paySystem.doPay(amount);
    }

    private void processPayResult(boolean processResult){
        System.out.println();
        if(processResult){
            System.out.println("결제가 성공했습니다.");
        }else{
            System.out.println("결제가 실패했습니다.");
        }
        System.out.println();
    }
}
