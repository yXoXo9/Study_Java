package static_2_forMethod;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        // => 멤버 변수도 없는 Method 로만 구성되어 있는 객체
        String deco = utils.deco(s);


        /*
        * 인스턴스가 필요한 이유는, 멤버 변수(인스턴스 변수)를 참조하기 위함,
        * 멤버 변수가 없는데 기능만 제공하는 경우에도 객체를 생성해야 하는가?
        *
        * 즉, 객체 생성이 의미가 없는 경우에도 생성을 해야하나?
        * */
        System.out.println("deco = " + deco);

    }
}
