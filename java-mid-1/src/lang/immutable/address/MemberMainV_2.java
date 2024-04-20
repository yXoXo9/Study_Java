package lang.immutable.ImmutableAddress;

import lang.immutable.address.ImmutableAddress;
import lang.immutable.address.MemberV_2;

public class MemberMainV_2 {
    public static void main(String[] args) {

        ImmutableAddress ImmutableAddress = new ImmutableAddress("서울");

        MemberV_2 memberV1 = new MemberV_2("회원A", ImmutableAddress);
        MemberV_2 memberV2 = new MemberV_2("회원B", ImmutableAddress);

        // 회원A, B 처음 주소는 모두 서울
        System.out.println("회원A, B 처음 주소는 모두 서울");
        System.out.println("memberV1 = " + memberV1);
        System.out.println("memberV2 = " + memberV2);

        // 회원 B 주소를 부산으로 변경
        System.out.println("\n회원 B 주소를 부산으로 변경");
        // ,emberV2.getAddress().setValue("부산"); // 컴파일 오류
        memberV2.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산_memberV1 = " + memberV1);
        System.out.println("부산_memberV2 = " + memberV2);
    }
}
