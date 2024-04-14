package poly.car0;

public class CarMian_0 {
    public static void main(String[] args) {
        // 운전자를 생성해서
        Driver driver = new Driver();

        // 자동차라는 객체를 만들고
        K3Car k3Car = new K3Car();

        // 운전자(인터페이스, 역할)에 객체를 넘겨 줌
        // 이 순간, 드라이버가 k3car 를 갖게 되면서 driver 의 기능을 사용할 수 있게 됨
        /*
         * 객체 의존 관계 주입 (=종속성 주입 DI)
         * */
        driver.setK3Car(k3Car);
        driver.drive();

        // 구현(실체가)이 늘어날 때마다 코드가 계속 증가 됨
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();

        /*
        * 코드가 증가하는 근본적 원인은
        * 역할과 구현(실체)를 명확하게 구분하지 않고 개발했기 때문에 발생 됨
        * */

    }
}
