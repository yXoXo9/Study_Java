package lang.immutable.change;

public class ImmutableMain_1 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);

        // 새로운 객체로 받음
        ImmutableObj obj2 = obj1.add(20);

        // 계산 이후에도 기존 값과 신규 값 모두 확인 가능
        System.out.println("obj1.getValue() = " + obj1.getValue());
        System.out.println("obj2.getValue() = " + obj2.getValue());

    }
}
