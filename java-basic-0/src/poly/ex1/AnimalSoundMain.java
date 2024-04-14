package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        // 새로운 클래스 타입이 생길때마다 중복 코드가 발생
        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println();
        soundCat(cat);
        System.out.println();
        soundCaw(caw);

        /*
        다형적 참조와 메서드 오버라이딩을 활용하면
        서로 다른 클래스 타입이 모두 같은 타입을 사용하고,
        각자 자신의 메서드를 호출할 수 있다.
        */
    }

    private static void soundCaw(Caw caw){
        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void soundCat(Cat cat){
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
