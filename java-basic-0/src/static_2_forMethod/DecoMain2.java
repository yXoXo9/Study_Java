package static_2_forMethod;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);
        System.out.println("(static) deco = " + deco);

        /* Static이 붙은 정적 메서드는 객체 생성 없이 바로 호출할 수 있다.
        *
        * => 클래스 메서드,
        * 메서드 앞에 static 을 부여할 수 있다.
        * 정적 메서드, 클래스 메서드라고 하며
        * 클래스에 있는 정적 메서드를 바로 호출하는 것,
        *
        * static 이 붙지 않은 메서드를 인스턴스를 생성해야 호출할 수 있다.
        *
        * 인스턴스(힙 영역에 존재)에서 메서드 호출 시 스택 영역에 쌓임(메서드 호출, 지역 변수(매개변수포함),
        *
        * 객체를 생성하는 의미가 있는지 생각해야함.
        * 세션 정보 관련된 애를 static 선언해서 사용하는 것이 좋지 않을까?
        *
        * 하지만, ! 주의 ! 정적 메서드는 언제나 사용할 수 있는것이 아니다.
        * static 메서드의 경우 static 만 사용할 수 있다
        * => 내부 기능 사용시 static 이 붙은 정적 메서드 클래스 변수만 사용할 수 있다.
        * 클래스 내부기능을 사용할 때, 정적 메서드는 인스턴스 변수, 메서드를 사용할 수 없다.
        *
        * 모든 곳에서 static 을 호출할 수 있다.
        * => 접근 제어자만 허락한다면 클래스를 통해 모든 곳에서 static 을 호출할 수 있다.
        * */
    }
}
