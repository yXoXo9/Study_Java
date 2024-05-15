package nested.nested;

public class NestedOuter_1 {
    private static int outClassValue = 3;
    private int outInstancevalue = 2;

    // outer 클래스 안에 정적 중첩 클래스 생성
    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 정적 클래스 안에 정의된 자신의 멤버에 접근 - 당연히 가능
            System.out.println(nestedInstanceValue); // 1

            // 바깥 클래스 인스턴스 멤버에 접근 - 불가능
            // 생성 영역이 서로 다름.
            // System.out.println(outInstancevalue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private 또한 가능
            // 정적 변수이기 때문에 어디서든 접근할 수 있지만.

            // 여기서 말하는 private 또한 접근할 수 있다는 의미는,
            // 바깥 클래스 안에 정적 중첩 클래스가 선언됨으로써
            // 클래스 멤버의 private 접근제어자 범위에 정적 중첩 클래스가 포함됨으로,
            // 정적 중첩클래스에서 해당 클래스 멤버를 접근할 수 있다고 생각하는 것이 바람직
            System.out.println(NestedOuter_1.outClassValue); // 3
            // System.out.println(outClassValue);
        }
    }
}
