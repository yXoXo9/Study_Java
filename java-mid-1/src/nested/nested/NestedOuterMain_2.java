package nested.nested;

public class NestedOuterMain_2 {
    public static void main(String[] args) {
        /*
        * 여기서 outer 와 inner 는 서로 아무 관련이 없다.
        * 단지, 구조상 중첩해 있는 상태일 뿐
        * 즉, 하기 코드에서 outer 인스턴스 생성 코드는 필요가 없음
        * */
        // NestedOuter_1 outer = new NestedOuter_1();
        NestedOuter_1.Nested inner = new NestedOuter_1.Nested();
        inner.print();


        // class nested.nested.NestedOuter_1$Nested
        // 클래스 $(안쪽에 있는 클래스)
        System.out.println("inner.getClass() = " + inner.getClass());
    }
}
