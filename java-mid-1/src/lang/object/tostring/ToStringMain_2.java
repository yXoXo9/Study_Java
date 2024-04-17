package lang.object.tostring;

public class ToStringMain_2 {
    public static void main(String[] args) {
        Car car = new Car("newCarNm");
        Dog dog = new Dog("new멍", 4);
        Dog dog2 = new Dog("new2멍", 2);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog.toString());
        System.out.println(dog2.toString());
        System.out.println();

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog);
        ObjectPrinter.print(dog2);

        System.out.println("4. Object 해쉬코드 확인");
        System.out.println("참조 값 : " + System.identityHashCode(dog2));
        System.out.println("16진수로 처리 " + Integer.toHexString(System.identityHashCode(dog2)));

    }
}
