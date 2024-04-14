package poly.car1;

public class CarMain_1 {
    public static void main(String[] args) {

        Driver driver = new Driver();

        // 차량 선택 (1)
        K3Car k3Car = new K3Car();
        // == Car car = k3Car; 부모는 자식을 받을 수 있다.
        // driver.setCar(Car car = k3Car);
        driver.setCar(k3Car);
        driver.drive();

        // 차량 변경 (k3 -> model3car)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        // 차량 변경 (model3car -> newCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();


    }
}
