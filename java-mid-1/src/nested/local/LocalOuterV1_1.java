package nested.local;

public class LocalOuterV1_1 {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

        class LocalPrinter {
            int value = 0;

            public void printData(){
                System.out.println("InnerInstanceValue = " + value); // 인스턴스 변수
                System.out.println("localVar = " + localVar); // 지역 변수
                System.out.println("paramVar = " + paramVar); // 지역 변수
                System.out.println("outInstanceVar = " + outInstanceVar); // 같은 인스턴스 범위의 변수

            }
        }

        LocalPrinter innerLocalPrinter = new LocalPrinter();
        innerLocalPrinter.printData();

    }

    public static void main(String[] args) {
        LocalOuterV1_1 outerV1 = new LocalOuterV1_1();
        outerV1.process(5);
    }


}
