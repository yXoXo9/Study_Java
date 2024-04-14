package extends1.ex4;

public class GasCar extends Car {
//    자식(GasCar) -> 부모(Car) 를 바라보고 메서드를 사용함
    // 슈퍼 클래스(부모) Car 기능을 상속받음
    public void fillup(){
        System.out.println("기름을 주유합니다.");
    }

}
