package poly.ex2;

public class AnimalPolyMain_2 {
    public static void main(String[] args) {

        // Animal[] arrAnimal = new Animal[]{dog, cat, caw}; 과 동일 (같은 타입의 클래스는 생략가능, 축약)
        Animal[] arrAnimal = {new Dog(), new Cat(), new Caw(), new Duck()};

        // ==> Animal index1 = dog;
        // ==> Animal index2 = cat;
        // ==> Animal index3 = caw;

        // hoyKey = ctrl + alt + N ==> inline Variable => 변수 선언 부분을 합치는 단축키
        for (Animal animal : arrAnimal){
            soundAnimal(animal);
        }
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
