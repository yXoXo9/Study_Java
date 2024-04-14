package poly.ex6;

public class Bird extends AbstractAnimal implements Fly {
    @Override
    public void fly() {
        System.out.println("새 날기");
    }

    @Override
    public void sound() {
        System.out.println("상속받은 사운드 짹짹 !");
    }
}
