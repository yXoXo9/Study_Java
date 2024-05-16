package nested.local;

public class LocalOuterV2_3 {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

        // 내부 중첩 클래스 또한 인터페이스, 부모 클래스 등을 구현 & 상속받을 수 있음
        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("InnerInstanceValue = " + value); // 인스턴스 변수
                System.out.println("localVar = " + localVar); // 지역 변수
                System.out.println("paramVar = " + paramVar); // 지역 변수
                System.out.println("outInstanceVar = " + outInstanceVar); // 같은 인스턴스 범위의 변수
            }
        }

        LocalPrinter innerLocalPrinter = new LocalPrinter();
        innerLocalPrinter.print();

    }

    public static void main(String[] args) {
        LocalOuterV2_3 outerV1 = new LocalOuterV2_3();
        outerV1.process(5);
    }


}
