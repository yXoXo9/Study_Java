package lang.object.poly;

public class ObjectPolyExample_1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action (Object obj){
        /*
        부모 = 자식 가능
        Dog dog2 = new Dog();
        Object objx = dog2;
        */
        // Object objx = new Dog(); // 가능

        // obj 는 들어온 객체가 무엇인지 모름
        // obj.sound(); 컴파일 오류 발생
        // obj.move(); 컴파일 오류 발생

        // => 객체에 맞는 다운 캐스팅 필요
        if(obj instanceof Dog){
            ((Dog) obj).sound();
        }else if(obj instanceof Car){
            ((Car) obj).move();
        }
    }
}
