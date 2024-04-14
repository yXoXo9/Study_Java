package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        // !! InterfaceA interfaceA = new InterfaceA(); 인터페이스는 자신을 인스턴스로 생성할 수 없음

        InterfaceA child = new Child(); // 부모는 자식을 담을 수 있음

        child.methodA();
        child.methodCommon();

        System.out.println();
        InterfaceB child2 = new Child(); // 부모는 자식을 담을 수 있음

        child2.methodB();
        child2.methodCommon();
    }
}
