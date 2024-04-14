package poly.ex5;

public class Caw implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("인터페이스_구현 음매 !");
    }

    @Override
    public void move() {
        System.out.println("인퍼테이스_구현 소 이동 !");
    }
}
