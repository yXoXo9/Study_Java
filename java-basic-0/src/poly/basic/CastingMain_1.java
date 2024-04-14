package poly.basic;

public class CastingMain_1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스를 참조 (다형적 참조)
        Parent poly = new Child();

        // 단 자식의 기능은 호출할 수 없다.
        // poly.childMethod(); - Compile Error

        // => 슈퍼 클래스를 서브 클래스 타입으로
        // 강제로 확 내린다.
        // => 다운캐스팅을 통해 자식을 확인 할 수 있음
        // (부모 타입 -> 자식 타입) 잠깐 변경하면 됨
        // Child child = poly; // x001을 대입... 해서 => 현재 불가, 부모를 자식에 대입할 수 없음.
        Child child = (Child) poly; // 강제로 캐스팅
        System.out.println("다운 캐스팅 호출");
        // 부모 타입을 자식 타입으로 다운해서 캐스팅 하는 것
        child.childMethod();

        // * 캐스팅(cast...) 금속이나 다른 물질을 녹여서 특정한 형태나 모양으로 만드는 과정을 의미

        // 업 캐스팅 : 자식 클래스를 부모 클래스 타입으로 올리는 것
        // 다운 캐스팅 : 부모 클래스를 자식 클래스 타입으로 내리는 것

        /*
         * 실행순서
         * Child child = (Child) poly; // 강제로 캐스팅
         * => Child child = (Child) x001; // 참조값을 읽은 후 자식 타입으로 '일시적으로' 지정
         * ==>  Child child = x001; // 최종
         * ==> 캐스팅을 한다고해서 Parent poly의 타입이 변하는 것은 아니다.
         */
    }
}
