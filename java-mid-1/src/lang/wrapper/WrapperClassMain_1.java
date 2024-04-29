package lang.wrapper;

public class WrapperClassMain_1 {
    public static void main(String[] args) {
        // 'Integer(int)' is deprecated since version 9 and marked for removal
        Integer i = new Integer(777); // 미래에 삭제 예정.......... 대신 valueOf()를 사용하슈
        /*
        * 위의 생성자 주입의 경우 사용 시 마다 객체를 생성해야 하지만,
        *
        * 아래의 래퍼 클래스 같은 경우 미리 만들어 놓은 메서드를 통해
        * 사용 시 마다 객체 생성하지 않고, 처리
        * (상대적으로  처리 속도와 작업 효율이 높다)
        * */

        // -128 ~ 127 자주 사용하는 숫자 값 재사용, (불변)
        Integer i1 = Integer.valueOf(10); // 자바가 미리 만들어 줌 마치 문자 상수풀 처럼 변수에 할당함
        System.out.println("i = " + i);
        System.out.println();
        System.out.println("i1 = " + i1);

        Long l = Long.valueOf(660);
        System.out.println("l = " + l);
        Double v = Double.valueOf(10.50);
        System.out.println("v = " + v);

        // Integer 값 꺼내기
        int getIntValue = i.intValue();
        System.out.println("getIntValue = " + getIntValue);
        long getLongValue = l.longValue();
        System.out.println("getLongValue = " + getLongValue);

        System.out.println("비교 = ");
        System.out.println(" == : " + (i == getIntValue));
        System.out.println(" equals : " + (i.equals(getIntValue)));
    }
}
