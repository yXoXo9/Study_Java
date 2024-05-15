package nested.inner;

public final class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // 내부 클래스 (인스턴스 클래스)
    class InnerC {
        private int InnerInstanceValue = 1;

        public void print(){
            // 자기 자신에게 접근
            System.out.println(InnerInstanceValue); // 1

            // 내부 클래스에서, 바깥 인스턴스 멤버 접근, private 또한 접근 가능
            System.out.println(outInstanceValue); // 2

            // 내부 클래스에서, 바깥 클래스의 클래스 멤버에 접근 가능. private 또한 가능
            System.out.println(outClassValue);
        }
    }
}
