package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a){
        // (부모 생성자는 첫 줄에 호출해야 한다. - 미수행 시 오류)
//        super(); // 상속 한 슈퍼 클래스 기본 생성자, 생략 가능
        this(a,0);
        /**
         * * !+ 이전에 알고 있듯이 첫 줄에 this(...)를 사용할 수 있다(예외사항)!,
         * 하지만 super(...)에 대해서 언젠가는 반드시 호출해야 한다.
         * */
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b){
        super(); // 상속 한 슈퍼 클래스 기본 생성자, 생략 가능
        System.out.println("ClassB 생성자 a = " + a + "/ b = " + b);
    }

    private int responseA(int a){
        return a + 1024;
    }
}
