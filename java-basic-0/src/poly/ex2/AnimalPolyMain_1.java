package poly.ex2;

public class AnimalPolyMain_1 {
    public static void main(String[] args) {
        // Dog dog = new Dog();
        // Cat cat = new Cat();
        // Caw caw = new Caw();

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
        // 부모는 자식을 담을 수 있다
    }

    private static void soundAnimal(Animal animal){ // 코드의 핵심
        System.out.println("동물 소리 테스트 시작 !");
        animal.sound();
        /* 부모의 클래스 내 메서드가 호출되는게 아니라,
         자식 클래스 내 오버라이드 메서드가 호출 (오버라이드 메서드는 무조건 최우선 순위를 갖는다)
         */
        System.out.println("동물 소리 테스트 종료 !");
        System.out.println();
    }
}
