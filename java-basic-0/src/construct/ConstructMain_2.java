package construct;

public class ConstructMain_2 {
    public static void main(String[] agrs){
        // 기본생성자(이전)
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);
        // 오버로딩
        MemberConstruct member1 = new MemberConstruct("user1", 15);


        MemberConstruct[] members = {member1, member2};

        for(MemberConstruct s : members){
            System.out.println("이름 : " + s.name + " 나이: " + s.age + " 성적:" + s.grade );
        }
    }
}
