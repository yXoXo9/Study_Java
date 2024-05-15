package nested;

public class ShadowingMain_1 {
    public int value = 1;

    class Inner{
        public int value = 2;

        void go(){
            int value = 3;
            /*
            * 새로 만드는 동명변수들로 인해 이전 변수를 가려서
            * 보이지 않게 하는 것을 섀도잉(Shadowing) 이라고 한다.
            *
            * 섀도잉을 구현하는것은 프로그래밍 관점에서는 좋은 코드 구현이 아니다.
            * 프로그래밍에서 가장 중요한 것은 명확성,
            * 위와같이 이름이 같은경우엔 처음부터 서로 이름을 다르게 지어서
            * 명확성을 높인 코드를 구현하는 것이 더 나은 방법이다.
            * */
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShadowingMain_1.this.value = " + ShadowingMain_1.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain_1 thisMain = new ShadowingMain_1();
        Inner inner = thisMain.new Inner();
        inner.go();
    }
}
