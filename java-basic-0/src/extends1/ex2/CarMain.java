package extends1.ex2;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 부모에게 받은 메서드
        electricCar.charge();

        System.out.println();

        GasCar gasCar = new GasCar();
        gasCar.move(); // 부모에게 받은 메서드 ~> 자식에서 부모 방향으로 바라보고 호출
        gasCar.fillup();

    }
}
