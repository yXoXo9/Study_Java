package poly.basic;

// up casting vs down casting
public class CastingMain_3 {

    public static void main(String[] args) {
        Child child = new Child();
        // 다른 타입에 들어갈 때엔 무조건 캐스팅이 필요하다.
        Parent parent1 = (Parent) child; // 하지만 업 캐스팅은 생략 가능하며, 생략하는 것을 권장한다.
        Parent parent2 = child; // 권장된 업캐스팅 생략 코드

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
