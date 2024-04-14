package construct;

public class ConstructMain_1 {
    public static void main(String[] agrs){
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);
        /*
        * new MemberConstruct("user2", 16, 80)
        * => (1) new ... 인스턴스를 생성하고, (2) (클래스안에) 선언한 생성자를 호출한다.
        *
        * new 키워드를 사용해 객체를 생성할 때 마지막에 괄호를 포함해야 하는 이유가
        * 생성자 때문이다.
        * => (1) new ... 생성하면서 생성자를 호출( )하겠다는 의미
        *
        * 생성자를 왜 써야함?
        * 1. 중복 호출을 제거
        * ex) member.initMember("user1", 15, 90) . .. .
        * after => new Member("user1", 15, 90);
        *
        * 2. 제약 - 생성자 호출 필수 =>
        *   (!!!제일 중요!!!) 직접 정의한 생성자를 반드시 호출해야 한다.
        *   (2) 논리 오류 방지
        * 문법 오류는 없지만.
        * 아무 정보도 없는 객체(인스턴스)를 생성하고 메모리 낭비된다.
        * MemberConstruct member2 = new MemberConstruct();
        * ==> (constructor class ....) 컴파일 오류 발생
        *
        * ... 생성자를 메서드 오버로딩을 통해 여러개 정의할 수 있는데, 이 경우 하나만 호출하면 된다.
        * - 차후에 설명
        *
        * 생성자를 사용해 필수값 입력을 보장할 수 있다.
        *
        * !! 좋은 프로그램은 무한한 자유가 주어지는 프로그램이 아니라 !
        * 적절한 제약이 있는 프로그램이다.
        * */

        MemberConstruct[] members = {member1, member2};

        for(MemberConstruct s : members){
            System.out.println("이름 : " + s.name + " 나이: " + s.age + " 성적:" + s.grade );
        }
    }
}
