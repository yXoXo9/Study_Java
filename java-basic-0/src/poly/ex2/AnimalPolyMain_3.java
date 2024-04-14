package poly.ex2;

public class AnimalPolyMain_3 {
    public static void main(String[] args) {

        // Animal[] arrAnimal = new Animal[]{dog, cat, caw}; 과 동일 (같은 타입의 클래스는 생략가능, 축약)
        Animal[] arrAnimal = {new Dog(), new Cat(), new Caw(), new Duck()};
        // hoyKey = ctrl + alt + N ==> inline Variable => 변수 선언 부분을 합치는 단축키
        for (Animal animal : arrAnimal){
            soundAnimal(animal);
        }

        /*
        * 배열과 반복문을 통해 라인수는 개선되었지만, 잠재적 문제는 아직 남아있다.
        * 1. Animal 클래스 (부모 클래스)를 생성할 수 있는 문제,
        * => 현재는 가능하다, 왜? 부모 클래스도 클래스이기 떄문
        *
        * 2. Animal 클래스 (부모 클래스)를 상속 받는 서브 클래스에서 sound() 메서드 오버라이딩을 하지 않을 가능성
        * => 사용자가 새로운 클래스를 생성하고 해당 기능 구현을 누락하거나 놓쳤을 가능성은 존재.
        *
        *
        * Then.
        * 1, 2 문제를 한번에 해결하는 방법은
        * 추상클래스와 추상메서드를 통해서 가능하다.
        * */

        // 이 클래스를 직접 생성해서 사용할 일이 있을까?
        // 이 클래스의 목적은 다형성을 위해서만 필요한 것,
        // 직접 인스턴스를 생성해서 사용할 일은 없다.
        // => 부모 클래스는 제공하지만 실제 생성되면 안되는 클래스로 만들 수 없을까
        Animal a = new Animal();
        a.sound();

    }

    // 클래스가 추가 되어도 변하지 않는 부분을 메서드로 추출
    private static void soundAnimal(Animal animal) {

        // Ctrl + alt + M Extract Method 해당 블럭을 메서드로 분리 시켜주는 단축키
        System.out.println("동물 소리 테스트 시작 !");
        animal.sound();
        System.out.println("동물 소리 테스트 종료 !");
        System.out.println();
    }

}
