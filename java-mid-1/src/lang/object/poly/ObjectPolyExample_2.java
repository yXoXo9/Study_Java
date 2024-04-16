package lang.object.poly;

public class ObjectPolyExample_2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); // Object 인스턴스 가능

        Object[] arrObject = {dog, car, object}; // 묵시적 생략
        // Object[] arrObject2 = new Object[]{dog, car, object}; //동일

        size(arrObject);

    }

    /*
    * Object 타입 (배열)은 모든 객체를 담을 수 있기 때문에,
    * 새로운 클래스에 대한 영향을 받지 않는다.
    * 즉, 하기 size 메서드는, 모든 클래스에 대해 사용할 수 있다.
    *
    * Object 같은 개념이 없다면..?
    * 모든 상황의 클래스를 전달받을 수 있는 메서드를 만들 수 없다.
    * ex) 전 세계의 모든 개발자가 비슷한, 호환되지 않는 수 많은 클래스가 생성됨
    * => 이 문제를 해결하기 위한 모든 객체를 참조할 수 있는 Object 의 활용
    * */
    private static void size(Object[] arrObject) {
        System.out.println("전달된 객체의 수는: " + arrObject.length);
    }

}
