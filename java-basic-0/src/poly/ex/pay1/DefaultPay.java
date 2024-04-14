package poly.ex.pay1;

public class DefaultPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다._null_Object_Pattern");
        return false;
    }
}
