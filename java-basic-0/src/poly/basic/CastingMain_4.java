package poly.basic;

// 다운 캐스팅을 자동으로 권장하지 않는 이유
public class CastingMain_4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        // Child child1 = parent1; // 일반적으로는 안됨

        Child child1 = (Child) parent1; // 다운 캐스팅으로 인해 가능
        System.out.println("다운캐스팅 실행");
        child1.childMethod();

        System.out.println("심각한 오류 발생");
        Parent parent2 = new Parent(); // Parent 타입 인스턴스 생성 (childMethod 아예 모름)
        Child child2 = (Child) parent2; // 다운 캐스팅 수행
        child2.childMethod(); // childMethod 아예 모름, 다운 캐스팅으로 인한 런타임 오류 (java.lang.ClassCastException) 발생
    }
}
