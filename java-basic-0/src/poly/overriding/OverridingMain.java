package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스를 참조 하는 경우
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("child.value = " + child.value);
        child.method();

        // 부모 변수가 부모 인스턴스를 참조하는 경우
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("parent = " + parent.value);
        parent.method();

        System.out.println();
        // * 부모 변수가 자식 인스턴스를 참조할 때 (다형적 참조 시)
        Parent poly = new Child();
        System.out.println("Parent -> Child");

        // 변수는 오버라이딩 (X) 불가
        System.out.println("poly = " + poly.value);
        // 메서드는 오버라이딩이 수행된다. => 다형성을 이루는 두번째 핵심 이론
        poly.method();

        // 오버라이딩된 자식의 메서드(손자 이후 N 레벨까지 있는 경우 최종 method가 수행된다)는 절대적 호출 우선권을 갖는다.
    }
}
