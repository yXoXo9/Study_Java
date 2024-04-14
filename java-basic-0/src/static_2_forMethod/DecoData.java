package static_2_forMethod;

public class DecoData {

    private int instanceValue; // 소속 인스턴스 (멤버 변수, 필드)
    private static int staticValue; // 소속 클레스

    public static void staticMethodCall(){
//        instanceValue++; // 인스턴스 변수 접근, compile Error 발생
//        instanceMethod(); // 인스턴스 메서드 접근, compile Error 발생
        /*
        * 인스턴스 변수, 메서드는 => 인스턴스를 생성해야만 활용할 수 있다
        * 왜?
        * 힙 영역에 담겨있어야 찾아갈 수 있기 때문,
        * 왜 찾아갈 수 있지?
        * 힙 영역에 담기면서 참조 주소값이 부여됨,
        * 객체 선언으로는 알수없다.
        *
        * 변수명에 대입해서 사용, 즉 인스턴스화 할 때 가능
        *
        * 하지만, 정적 메서드의 매개변수로 인스턴스를 받을 경우
        * 인스턴스의 참조값을 알 수 있으므로
        *
        * 인스턴스에 속해있는 변수, 메서드를 호출할 수 있다.
        * */

        staticValue++; // 정적 변수 접근
        staticMethod();
    }

    /* 외부에서 넘어온 참조값을 사용 */
    public static void staticCall(DecoData deco){
        deco.instanceValue++;
        deco.instanceMethod();
    }

    public static void staticCall(){
        staticValue++;
        staticMethod();
    }

    public void instanceCall(){
        instanceValue++; // 인스턴스 변수 호출
        instanceMethod(); // 인스턴스 메서드 호출

        staticValue++; // 클래스 변수 호출
        staticMethod(); // 클래스 메서드 호출
    }

    private void instanceMethod(){ // 인스턴스 소속
//        DecoData.staticValue++;
//        DecoData.staticMethod();
//        staticValue++;
           staticMethod();
//         반대로 스태틱 변수, 메서드는 모든곳에서 접근 가능.
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod(){ // 클래스 소속
//        instanceValue++; // 인스턴스 변수 접근, compile 에러
//        instanceMethod(); // 인스턴스 메서드 접근, compile 에러

        /*
        클래스 소속에서 힙 영역에 대한 접근은 객체 선언이 아닌(선언은 찾아갈 수 없음),
        인스턴스를 통해서만 할 수 있다.
        */
//        DecoData da = new DecoData();
//        da.instanceValue++;
//        da.instanceMethod();

        System.out.println("staticValue = " + staticValue);
    }
}
