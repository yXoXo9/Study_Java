package poly.ex.pay_0_edit;

public class TossPay implements PaySystem {
    @Override
    public boolean doPay(int amount) {
        System.out.println("토스 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
