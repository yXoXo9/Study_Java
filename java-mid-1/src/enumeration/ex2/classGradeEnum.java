package enumeration.ex2;

/*
* 회원 등급을 다루는 클래스
* */
public class classGradeEnum {
    /* 각각 회원 등급별 상수를 선언한다.
    * */
    public static final classGradeEnum BASIC = new classGradeEnum();
    public static final classGradeEnum GOLD = new classGradeEnum();
    public static final classGradeEnum DIAMOND = new classGradeEnum();

    /* static 을 사용하여 상수를 메서드 영역에 적재하고
    * final 을 선언하여 인스턴스(참조 값)을 변경할 수 없게 한다.
    * */

    /*
    * private 생성자를 통해 외부에서 이 클래스를 생성할 ㅜㅅ 없게 만든다.
    * */
    private classGradeEnum() {}
}
