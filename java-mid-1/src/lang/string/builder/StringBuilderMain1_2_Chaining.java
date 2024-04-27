package lang.string.builder;

public class StringBuilderMain1_2_Chaining {
    public static void main(String[] args) {
        /* 가변형 String 사용 */
        StringBuilder sb = new StringBuilder();
        /*sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");*/
        String chainingStr = sb.append("A").append("B").append("C").append("D")
        .insert(2, "insertJava")
        .delete(2, 6)
        .reverse()
        .toString();
        System.out.println("chainingStr = " + chainingStr);
        /*
        * 자바 라이브러르 및 오픈 소스들 대부분이 메서드 체이닝 방식을 종종 사용한다.
        * 만드는 사람이 수고하면 쓰는 사람이 편하고,
        * 만드는 사람이 편하면 쓰는 사람이 수고롭다......
        * */
    }
}
