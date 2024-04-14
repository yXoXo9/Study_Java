package final_1;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("loginId", "userName");
        member.print();
        member.changeData("changeId", "YOON");
        member.print();
    }
}
