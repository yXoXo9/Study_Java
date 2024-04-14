package poly.ex.pay1;

// 결제수단을 보관한다는 의미를 부여하고 자체 인스턴스를 생성하지 못하도록 추상 클래스로 변경,
public abstract class PayStore {
    // 인스턴스 생성 없이 다이렉트로 사용할 수 있도록 정적 메서드로 처리
    public static Pay findPay(String option) {
        if("kakao".equals(option)) {
            // KakaoPay kakaoPay = new KakaoPay(); // 1. 어떤 구현체인지 구분하는 선택
            return new KakaoPay(); // 인터페이스로 구현관계 설정
        } else if("naver".equals(option)) {
            return new NaverPay();
            // result = pay.pay(amount); // 2. 실제 구현체가 수행하는 부분이 합쳐져 있음
        } else if("new".equals(option)) {
            return new NewPay();
        } else {
            // System.out.println("결제 수단이 없습니다.");
            // return null;
            return new DefaultPay();
            // 이로인해 Pay 메서드는 절때로 null을 반환하지 않는다.
        }
    }
}
