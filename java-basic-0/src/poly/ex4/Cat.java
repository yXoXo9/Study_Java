package poly.ex4;

public class Cat extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("추상 냐옹 !");
    }

    @Override
    public void move() {
        System.out.println("순수 추상클래스로 인한 고양이 이동 !");
    }
}
