package final_1;

public class ConstantMain1 {

    public static void main(String[] args) {
//        System.out.println("프로그램 최대 참여자 수 " + 1000); // 1000 magic number....... 라고 말함
        System.out.println("프로그램 최대 참여자 수 " + Constant.MAX_USERS); // 1000 magic number....... 라고 말함

        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount){
        System.out.println("참여자 수 = " + currentUserCount);

//        if (currentUserCount > 1000){
        if (currentUserCount > Constant.MAX_USERS){
            System.out.println("대기자로 등록합니다.");
        }else{
            System.out.println("게임에 참여합니다.");
        }
    }

    // currentUserCount 1000명에서 2000으로 바꾼다고 하면.....?
    // 바꿀 포인트가 매우 많다.

    // ==> Constant.MAX_USERS 를 통해 중앙에서 일관되게 컨트롤 할 수 있다, 물론 서버는 재기동 해야한다.
    // ==> 과거 숫자로 표시된 의미를 상수명을 통해 추론 가능
}
