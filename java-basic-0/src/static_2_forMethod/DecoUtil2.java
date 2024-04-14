package static_2_forMethod;

public class DecoUtil2 {

    /* 메서드, static 영역에 생성
    * 인스턴스를 거치지 않고(생성 없이) 클래스 명을 통해서 바로 호출. (클래스 변수를 호출했던 것처럼)
    * */
    public static String deco(String str) {
        return "*" + str + "*";
    }
}
