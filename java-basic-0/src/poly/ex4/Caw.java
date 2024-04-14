package poly.ex4;

public class Caw extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("추상 음메 !");
    }

    @Override
    public void move() {
        System.out.println("순수 추상클래스로 인한 소 이동 !");
    }
}
