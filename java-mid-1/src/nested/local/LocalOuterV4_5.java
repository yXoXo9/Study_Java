package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4_5 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar){

        int localVar = 1;
        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("InnerInstanceValue = " + this.value); // LocalPrinter 인스턴스 변수

                // 인스턴스는 지역 변수보다 더 오래 살아 남는다.
                System.out.println("localVar = " + localVar); // 지역 변수
                System.out.println("paramVar = " + paramVar); // 지역 변수
                System.out.println("outInstanceVar = " + LocalOuterV4_5.this.outInstanceVar); // LocalOuterV3_4 인스턴스 범위의 변수
            }
        }

        LocalPrinter innerLocalPrinter = new LocalPrinter();
        // 지역 클래스를 생성 후 localVar 의 값을 변경 시...? 캡처를 다시 하는건가?
        /* 컴파일 오류 발생 => 스택 영역에 존재하는(지역변수 생성 시) 변수의 값과
        인스턴스 생성 시, 힙 영역에 존재하는 캡처 변수의 값이 서로 달라지는 문제가 발생

        ==> 동기화 문제가 발생된다.
        Variable 'localVar' is accessed from within inner class, needs to be final or effectively final
        localVar = 10;
        Variable 'paramVar' is accessed from within inner class, needs to be final or effectively final
        paramVar = 20;
        */

        return innerLocalPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV4_5 outerV1 = new LocalOuterV4_5();
        Printer withPrinter = outerV1.process(5);

        // withPrinter 를 나중에 실행(이전엔 내부 중첩 클래스 안에서 바로 메서드를 호출했음 - 2번 부분)
        // => process()의 스택 프레임이 사라진 이후 실행 - 생명주기를 늘림
        // (이전 내부 중첩 클래스에서 끝나던 인스턴스 호출을, 이후 메인 메서드 종료 시점까지 연장)

        // 그런데, outerV1.process(5)를 호출 함으로서 Printer 의 구현체인 LocalPrinter 의 인스턴스를 반환 받으면서
        // 지역변수 localVar, paramVar 의 생명주기는 종료가 된다.
        // 그럼에도 불구하고 withPrinter.print()를 통해 지역변수의 값을 호출할 수 있는데
        // 이게 가능한 이유는 무엇인가......? => 자바에서 이와 같은 서로 다른 생명주기에 대한 호출 문제를 해결하기 위해

        // !!!지역 클래스의 인스턴스를 생성하는 시점에!!! !!!지역 변수를 생성한 인스턴스에 복사해서 넣어두는!!!
        // @지역변수 캡쳐@ 라는 과정을 구현한다.
        // => 접근이 필요한 지역 변수만 캡처해서 복사하는 것
        withPrinter.print();

        // 확인하기위한 추가
        System.out.println("필드 확인");

        // withPrinter 의 클래스 정보 중에서, 선언한 필드 정보들을 얻을수 있음
        Field[] declaredFields = withPrinter.getClass().getDeclaredFields();

        /*
        * declaredField = int nested.local.LocalOuterV3_4$1LocalPrinter.value // class LocalPrinter implements Printer{ ... int value = 0; }
        * declaredField = final int nested.local.LocalOuterV3_4$1LocalPrinter.val$localVar
        * declaredField = final int nested.local.LocalOuterV3_4$1LocalPrinter.val$paramVar
        * declaredField = final nested.local.LocalOuterV3_4 nested.local.LocalOuterV3_4$1LocalPrinter.this$0 // 바깥 클래스를 참조하기 중첩 클래스 인스턴스 생성시 생성되는 필드
        * */
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }
    }


}
