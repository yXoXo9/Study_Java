package poly.ex4;

import poly.ex4.AbstractAnimal;

// Class 'Dog' must either be declared abstract or implement abstract method 'sound()' in 'AbstractAnimal'
public class Dog extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("추상 멍멍 !");
    }

    @Override
    public void move() {
        System.out.println("순수 추상클래스로 인한 개 이동 !");
    }
}
