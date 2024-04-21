package lang.immutable.change;

public class MutableMain {

    public static void main(String[] args) {
        MutableObj mutableObj = new MutableObj(10);
        mutableObj.add(20);

        // 계산 이후(10+20) 의 기존 값(생성 값 10)은 사라짐
        System.out.println("mutableObj = " + mutableObj.getValue());

        // 이를 불변 객체 add 로 변경하기,
    }
}
