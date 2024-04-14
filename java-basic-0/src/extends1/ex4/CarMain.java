package extends1.ex4;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 부모에게 받은 메서드

        Car car = new ElectricCar();
        // car.charge(); // 컴파일 오류 발생

        System.out.println();

        GasCar gasCar = new GasCar();
        gasCar.move(); // 부모에게 받은 메서드 ~> 자식에서 부모 방향으로 바라보고 호출

        System.out.println();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();

        // 상속 관계 덕분에 중복을 줄어들고, 새로운 수소차(새로운 기능)을 확장(extends)할 수 있다.
    }
}
