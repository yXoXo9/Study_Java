package poly.ex4;

// 추상객체 명은 굳이 Abstract 라고 적지 않음, 단순 animal 이라고 해도 됨
public abstract class AbstractAnimal {

    // 자식에서 반드시 오버라이딩 해야하는 메서드
    public abstract void sound();

    /*
    자식에서 선택적으로 사용해도 됨 => 자식에게 단순 상속 목적
    public void move() {System.out.println("동물이 움직입니다.");}
    순수 추상 클래스로 만들기 위한 일반 메서드를 추상 메서드로 변환
     */
    public abstract void move();
}
