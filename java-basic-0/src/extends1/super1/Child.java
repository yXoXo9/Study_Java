package extends1.super1;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this.value = " + value); // this 생략 가능, (자기 자신을 부름)
        System.out.println("super.value = " + super.value);

        this.hello(); // this 생략 가능,
        super.hello(); // 슈퍼 클래스에서 찾음 (부모)
    }
}
