package extends1.ex4;

public class Car {
    /* 슈퍼 클래스 (부모 클래스) 공통 부분 제작 */
    public void move(){
        System.out.println("차를 이동합니다.");
    }

    //추가

    public void openDoor(){
        System.out.println("문을 엽니다.");

        // openDoor를 통해 자식이 모두 이 메서드를 호출할 수 있음.
    }
}
