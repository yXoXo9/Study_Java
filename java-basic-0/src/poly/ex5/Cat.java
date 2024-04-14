package poly.ex5;

public class Cat implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("인터페이스_구현_ 냐옹 !");
    }

    @Override
    public void move() {
        System.out.println("인터페이스_구현_ 이동 !");
    }
}
