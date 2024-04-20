package lang.immutable.address;

public class MemberMainV_1 {
    public static void main(String[] args) {

        Address address = new Address("서울");

        MemberV_1 memberV1 = new MemberV_1("회원A", address);
        MemberV_1 memberV2 = new MemberV_1("회원B", address);

        // 회원A, B 처음 주소는 모두 서울
        System.out.println("회원A, B 처음 주소는 모두 서울");
        System.out.println("memberV1 = " + memberV1);
        System.out.println("memberV2 = " + memberV2);

        // 회원 B 주소를 부산으로 변경
        System.out.println("\n회원 B 주소를 부산으로 변경");
        memberV2.getAddress().setValue("부산");
        System.out.println("부산_memberV1 = " + memberV1);
        System.out.println("부산_memberV2 = " + memberV2);

    }
}
