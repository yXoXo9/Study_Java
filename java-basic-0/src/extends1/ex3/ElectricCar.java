package extends1.ex3;

public class ElectricCar extends Car { // 슈퍼 클래스의 메서드를 물려 받으므로 move 는 선언하지 않아도 쓸 수 있음.

    public void charge() {
        System.out.println("충전합니다.");
    }
}
