package access_6.a;

public class AccessInnerMain {
    public static void main(String[] args){
        AccessData ad = new AccessData();
        // public 호출 가능
        ad.publicField = 1;
        ad.publicMethod();

        // 같은 패키지 default
        ad.defaultField = 2;
        ad.defaultMethod();

        // private 호출 불가
//        선언조차 불가
//        ad.privateField = 3;
//        ad.privateMethod();

        // public method
        ad.innerAccess();
        // 이후 메서드 내부 호출이기 때문에 private 또한 접근 가능
    }
}
