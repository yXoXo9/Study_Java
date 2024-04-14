package poly.ex5;

public class Dog implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("인터페이스_구현_멍멍 !");
    }

    @Override
    public void move() {
        System.out.println("인터페이스_구현_개 이동 !");
    }
}
