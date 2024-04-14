package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조,
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println();
        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        System.out.println();
        // 부모 변수가 자식 인스턴스를 참조(다형적 참조)
        System.out.println("Parent -> Child");
        // 생성은 자식을 생성, 그런데, 자식을 생성하면 메모리상 슈퍼 클래스(Parent)가 자동으로 생성된다.
        Parent poly = new Child(); // 부모 타입이 자식 타입을 받을 수 있다.
        /**
         * 슈퍼 클래스는 서브 클래스를 담을 수 있다.
         * */
        poly.parentMethod();
        /**
         * 자식 타입은 부모 타입을 담을 수 없다.
         * */
        // Child child_1 = new Parent(); Compile Error (X)

        /* +a Child 하위에 손자가 있는 경우에도 가능
        Parent poly = new ChildGrandson();
        자바에서는 자신을 기준으로 모든 자식 타입을 참조할 수 있다.
        => 다양한 형태를 참조할 수 있다. 다형적 참조
        */

        /* 다형적 참조와 인스턴스 실행
            poly.parentMethod(); 호출 시 Parent 타입으로 선언해 놓음
            => 자식에서 찾는게 아니라 부모를 다이렉트로 먼저 찾아감
         */

        // poly.childeMethod(); 자식 메서드를 호출할 수 없음 - Compile Error, 부모 입장에선 자식이 누구인지 알 수 없음.
        // => 자식의 메서드를 접근하거나 사용하기 위해선 '캐스팅'이 필요하다.

        /*
        * 정리 : 다형적 참조의 핵심은 부모는 자식을 품을 수 있다는 것,
        *
        * 근데 지금은 오히려 더 불편함 그냥 Child 쓰면 되는거 아냐?
        *
        * => 다형성의 다른 이론들도 함께 알아야 이해할 수 있다.
        * => 지금은 문법과 이론을 익히는데만 집중, 이후 다른 이론까지 알게 되면 영향력이 높은 프로그램을 갖출 수 있다.
        * */




    }
}
