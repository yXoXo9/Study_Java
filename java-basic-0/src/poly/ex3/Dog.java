package poly.ex3;

// Class 'Dog' must either be declared abstract or implement abstract method 'sound()' in 'AbstractAnimal'
public class Dog extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("추상 멍멍 !");
    }
}
