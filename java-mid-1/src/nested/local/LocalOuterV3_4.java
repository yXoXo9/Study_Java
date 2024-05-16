package nested.local;

public class LocalOuterV3_4 {
    private int outInstanceVar = 3;

    /*
    * 생명주기
    * */
    public Printer process(int paramVar){

        // 지역 변수(localVar)는 스택 프레임이 종료되는 순간 함께 제거됨
        int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("InnerInstanceValue = " + value); // LocalPrinter 인스턴스 변수

                // 인스턴스는 지역 변수보다 더 오래 살아 남는다.
                System.out.println("localVar = " + localVar); // 지역 변수
                System.out.println("paramVar = " + paramVar); // 지역 변수
                System.out.println("outInstanceVar = " + outInstanceVar); // LocalOuterV3_4 인스턴스 범위의 변수
            }
        }

        // 지역 변수면서 인스턴스 (innerLocalPrinter)
        LocalPrinter innerLocalPrinter = new LocalPrinter();
        // innerLocalPrinter.print(); // 를 여기서 실행하지 않음, Printer 인스턴스만 반환 (2)

        return innerLocalPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV3_4 outerV1 = new LocalOuterV3_4();
        Printer withPrinter = outerV1.process(5);

        // withPrinter 를 나중에 실행(이전엔 내부 중첩 클래스 안에서 바로 메서드를 호출했음 - 2번 부분)
        // => process()의 스택 프레임이 사라진 이후 실행 - 생명주기를 늘림
        // (이전 내부 중첩 클래스에서 끝나던 인스턴스 호출을, 이후 메인 메서드 종료 시점까지 연장)
        withPrinter.print();
    }


}
