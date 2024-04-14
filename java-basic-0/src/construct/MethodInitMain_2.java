package construct;

public class MethodInitMain_2 {
    public static void main(String[] args){
        MemberInit member1 = new MemberInit();
//        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;


        MemberInit[] members = {member1, member2};

        for(MemberInit s : members){
            System.out.println("이름 : " + s.name + " 나이: " + s.age + " 성적:" + s.grade );
        }
    }
/*
    static void initMember(MemberInit member, String name, int age, int grade){
        현재, member 클래스의 멈버변수를 그대로 바꾸는 중...

        member.name = 인자
        member.age = 인자
        member.grade = 인자
        ==> (1)클래스 안에 메소드를 선언해서 객체 지향적 프로그래밍을 수행하는 것이 좋아 보임
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
*/
}
