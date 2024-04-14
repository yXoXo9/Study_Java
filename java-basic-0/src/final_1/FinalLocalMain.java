package final_1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        // data1 = 20; // Variable 'data1' might already have been assigned

        // 파라미터 받을 때 pValue 할당
        finalMethod(10);
    }

    static void finalMethod(final int pValue){
        System.out.println("pValue = " + pValue);
        // pValue = 20; // Cannot assign a value to final variable 'pValue'
        // 이후 메서드 종료 시 까지 변수의 값은 고정된다.
    }

}
