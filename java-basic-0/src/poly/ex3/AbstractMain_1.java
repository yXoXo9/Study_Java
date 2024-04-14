package poly.ex3;

public class AbstractMain_1 {
    public static void main(String[] args) {
        // 'AbstractAnimal' is abstract; cannot be instantiated
        // AbstractAnimal abstractAnimal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();
        System.out.println();
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    // 클래스가 추가 되어도 변하지 않는 부분을 메서드로 추출
    private static void soundAnimal(AbstractAnimal animal) {

        // Ctrl + alt + M Extract Method 해당 블럭을 메서드로 분리 시켜주는 단축키
        System.out.println("추상_동물 소리 테스트 시작 !");
        animal.sound();
        System.out.println("추상_동물 소리 테스트 종료 !");
        System.out.println();
    }

}
