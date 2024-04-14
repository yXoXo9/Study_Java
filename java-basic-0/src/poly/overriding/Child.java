package poly.overriding;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void method() {
        // 오버라이딩 된 자식 메서드
        System.out.println("Child.method");
    }
}
