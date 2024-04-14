package extends1.ex4;

public class ElectricCar extends Car { // 슈퍼 클래스의 메서드를 물려 받으므로 move 는 선언하지 않아도 쓸 수 있음.

//    @Override 사실 없어도 쓸 수 있음
    
    @Override // 부모의 그능을 오버라이드 할 것이다.
    public void move(){ // 메서드를 잘못 쓸 경우 오버라이딩이 아닌 신규 생성 메서드
        System.out.println("전기차를 ! 빠르게 이동합니다.");
    } // 부모에서 물려받은 기능을 자식이 @Override 애노테이션, 어노테이션
    
    // @ 프로그램이 읽을 수 있는 특별한 주석.. 이라고 지금은 간단하게 설명
    
    // 즉, @Override 어노테이션은 정확히 오버라이드 하지 않은 경우 컴파일 에러를 발생시켜줌
    // 개발자가 알아차릴 수 있는 도구, 코드의 명확성을 위해 붙여주는 것이 좋다.

    public void charge() {
        System.out.println("충전합니다.");
    }
}
