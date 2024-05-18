package nested.anonymous;

import nested.local.Printer;

/*
* 익명 클래스의 사용
* */
public class Anonymous_Outer_1 {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

        // 내부 중첩 클래스 또한 인터페이스, 부모 클래스 등을 구현 & 상속받을 수 있음
        class LocalPrinter implements Printer {
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
        // innerLocalPrinter.print();

        /*
         * 인터페이스를 1. 상속받은 인스턴스 생성, 1-1. 인스턴스 기능 구현, 2. 인스턴스 호출
         * 과정을 익명클래스(== 무명클래스)로 처리하여
         * 과정을 단축시킴
         * ==> 인터페이스 생성 및 구현과정을 동시에 수행
         * */
        Printer anonymousPrinter = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("InnerInstanceValue = " + value); // 인스턴스 변수
                System.out.println("localVar = " + localVar); // 지역 변수
                System.out.println("paramVar = " + paramVar); // 지역 변수
                System.out.println("outInstanceVar = " + outInstanceVar); // 같은 인스턴스 범위의 변수
            }
        };
        anonymousPrinter.print();
        /*
        * Class 'Anonymous class derived from Printer' must implement abstract method 'print()' in 'Printer'
        * 익명 클래스는 부모 클래스를 상속 받거나, 인터페이스를 구현해야 한다.
        * 이름을 가지지 않으므로 생성자를 가질 수 없다 (기본 생성자만 사용 됨)
        new Printer(){
            @Override
            접근제어자 반환타입 method() { body }
        };
        * */
        // anonymousPrinter.getClass() = class nested.anonymous.Anonymous_Outer_1$1 (== $1 익명 클래스를 지칭, n개가 있 $n 이런식으로 증가하면서 표현)
        System.out.println("anonymousPrinter.getClass() = " + anonymousPrinter.getClass());

        /*
        * 익명 클래스의 장점 (지역 클래스를 써도 무방함..)
        * 클래스를 별도로 생성, 구현 과정을 거치지 않으므로 추상 클래스 사용에대한 코드 라인을 간결하게 처리할 수 있다.
        *
        * 하지만, 복잡하거나 재사용이 필요한 경우, 별도의 클래스로 정리하는 것이 좋다.
        * */
    }

    public static void main(String[] args) {
        Anonymous_Outer_1 outerV1 = new Anonymous_Outer_1();
        outerV1.process(5);
    }
}
