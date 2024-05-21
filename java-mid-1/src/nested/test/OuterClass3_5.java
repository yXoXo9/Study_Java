package nested.test;

public class OuterClass3_5 {

    public OuterClass3_5() {
        // 1. main 에서 인스턴스 생성
        System.out.println("1");
    }

    public void myMethod(){
        // 2. main 에서 호출 outerClass35.myMethod();
        System.out.println("2");

        class LocalClass {

            public LocalClass() {
                System.out.println("4");
                this.hello();
            }

            public void hello(){
                System.out.println("3");
                System.out.println("LocalClass.hello");
            }
        }

        LocalClass localClass = new LocalClass();
    }
}
