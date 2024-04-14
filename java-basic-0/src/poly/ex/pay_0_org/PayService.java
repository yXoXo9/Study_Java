package poly.ex.pay_0_org;

public class PayService {
    public void processPay(String option, int amount){

        boolean result;

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        if("kakao".equals(option)) {
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
            System.out.println();
        } else if("naver".equals(option)) {
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
            System.out.println();
        } else {
            System.out.println("결제 수단이 없습니다.");
            System.out.println();
            result = false;
        }

        if(result){
            System.out.println("결제가 성공했습니다.");
            System.out.println();
        }else{
            System.out.println("결제가 실패했습니다.");
            System.out.println();
        }
    }
}
