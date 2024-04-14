package poly.basic;

public class CastingMain_2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스를 참조 (다형적 참조)
        Parent poly = new Child();

        // 단 자식의 기능은 호출할 수 없다.
        // poly.childMethod(); - Compile Error

        // => 슈퍼 클래스를 서브 클래스 타입으로
        // 강제로 확 내린다.
        // => 다운캐스팅을 통해 자식을 확인 할 수 있음
        // (부모 타입 -> 자식 타입) 잠깐 변경하면 됨
        Child child = (Child) poly; // 강제로 캐스팅
        System.out.println("다운 캐스팅 호출");
        // 부모 타입을 자식 타입으로 다운해서 캐스팅 하는 것
        child.childMethod();

        System.out.println();
        System.out.println("일시적 다운 캐스팅 호출");
        // 일시적 다운 캐스팅 - 해당 메서드를 !호출하는 순간만! 다운 캐스팅
        // poly.childMethod(); 불가능
        // (Child) poly.childMethod(); // 연산자 우선순위로 인한 에러
        ((Child) poly).childMethod();

        // 일시적 !!, 정확히는 poly가 Child 타입으로 바뀌는 것이 아니다.

    }
}
