package memory;

public class JavaMemoryMain_2 {
    public static void main(String[] args) {
        System.out.println("main Start");
        method1();
        System.out.println("main End");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 End"); // 메서드 1이 종료되고 Data 의 data1 인스턴스는 GC 대상 (참조하는 곳이 없음)

        /* Ref.
        * 힙 영역 외부가 아닌,
        * 힙 영역 내에서 서로 참조하는 인스턴스의 경우 (서로 바라보는 객체)
        * GC 대상이 된다.
        * */
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value = " + data2.getValue());
        System.out.println("method2 End");
    }

    // 메모리 구조에서 어떻게 돌아가는가?

}
