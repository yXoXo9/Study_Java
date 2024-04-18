package lang.object.test;

public class RectangleMain {
    public static void main(String[] args) {
        /*
        * 실행 결과를 보고 Rectangle 클래스 제작,
        * Rectangle 클래스에 IDE 기능을 사용한 toString() 및 equals() 메서드를 재정의 할 것
        * r1 과 r2 는 넓이 와 높이를 가지며, 모두 같다면 동등성 equals() 비교에 성공해야 한다.
        * */
        Rectangle rectangle1 = new Rectangle(100, 20);
        Rectangle rectangle2 = new Rectangle(100, 20);

        System.out.println(rectangle1);
        System.out.println(rectangle2);

        System.out.println(rectangle1 == rectangle2);
        System.out.println(rectangle1.equals(rectangle2));

        /*
        * 실행결과
        * Rectangle{width=100, height=20}
        * Rectangle{width=100, height=20}
        * false
        * true
        * */
    }
}
