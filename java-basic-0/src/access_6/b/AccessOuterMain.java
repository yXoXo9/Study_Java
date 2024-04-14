package access_6.b;

import access_6.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData ad = new AccessData();
        // public 호출 가능
        ad.publicField = 1;
        ad.publicMethod();

//        같은 패키지 default => 다른 패키지(b) 는 호출 불가, AccessData 는 a 패키지 소속
//        ad.defaultField = 2;
//        ad.defaultMethod();

//        private 호출 불가
//        선언조차 불가
//        ad.privateField = 3;
//        ad.privateMethod();

        // public method
        ad.innerAccess();
        // 이후 메서드 내부 호출이기 때문에 private 또한 접근 가능
    }
}
