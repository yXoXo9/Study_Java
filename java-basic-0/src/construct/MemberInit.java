package construct;

public class MemberInit {
//  생성자가 왜 필요한가?
    String name;
    int age;
    int grade;

// (1) 추가
    void initMember(String name, int age, int grade){
        /*
        현재, member 클래스의 멈버변수를 그대로 바꾸는 중...

        member.name = 인자
        member.age = 인자
        member.grade = 인자
        ==> (1)클래스 안에 메소드를 선언해서 객체 지향적 프로그래밍을 수행하는 것이 좋아 보임
        */
        // 나의(this) 멤버변수에 인자 값을 넣겠다.
        this.name = name;
        this.age = age;
        this.grade = grade;

        /* this. (인스턴스 자신의 참조값(객체 선언 시 주소)을 가르킨다. 즉, this = 참조값, 이며
            this는 인스턴스 자신을 가르킨다.)
        * 문제,
        * 매개변수와 멤버변수의 이름이 똑같다
        * 멤버, 메서드의 변수 이름이 같으면 둘을 구분하는 법은?
        * 변수는 변수 라인 기준, 스코프(코드 블럭) 상 가까운 파라메터로 우선순위가 부여(인식)됨
        * 즉, 가까운 지역변수(매개변수 포함)을 찾고 없으면 그 다음 멤버변수를 찾는다.
        * 멤버변수도 없는경우 오류가 발생된다.
        *
        * */
    }


}
