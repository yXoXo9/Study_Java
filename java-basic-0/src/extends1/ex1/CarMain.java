package extends1.ex1;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        System.out.println();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.charge();


        // (전기)차, (가솔린)차 => Car 라는 큰 개념, 기준개념을 가진
        // 하위 개념의 차(자동차라는 추상적인 개념)
        // 공통 기능을 발견할 수 있다(move 등)
        // 주유하는 방식이 다른 것뿐, 이동하는 것은 똑같다.
        // 이런 상황에 상속 관계를 사용하는 것이 효과적이다.
        // 상속관계(자동차=부모), 이동한다=자식

    }
}
