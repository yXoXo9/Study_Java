package final_1;

public class Member {

    private final String userId; // final 키워드 사용
    private String name;

    public Member(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    // 잘못 만든 메서드, 왜? userId는 final 로 선언해 놓았음, 의미가 다르다.
    public void changeData(String userId, String name){
//        this.userId = userId; // 컴파일 오류 (생성자에서 final로 이미 할당되기 때문, 그 외 변경할 수 없음.)
        this.name = name;
    }
//    member.changeData("changeId", "YOON"); 오남용 발생

    public void changeData(String name){
        this.name = name;
    }

    public void print() {
        System.out.println("Member{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                '}');
    }
}
