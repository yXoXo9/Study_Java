package lang.string.chaining;

public class MethodChainigMain_1 {
    public static void main(String[] args) {
        /*
         * 반환값 (객체)를 사용하지 않고,
         * 결과값을 변수에 더해 사용
         * */

        ValueAdderForMethodChaining v1 = new ValueAdderForMethodChaining();
        v1.add(1);
        v1.add(2);
        v1.add(3);
        int result = v1.getValue();

        System.out.println("result = " + result);

        /*
        * 반환값을 사용한 테스트
        * */
        System.out.println();
        ValueAdderForMethodChaining v2 = new ValueAdderForMethodChaining();
        ValueAdderForMethodChaining add = v2.add(1);
        ValueAdderForMethodChaining test3 = add.add(2);
        ValueAdderForMethodChaining add2 = test3.add(3);
        int result2 = add2.getValue();
        System.out.println("반환값 사용 // result2 = " + result2);

        /* 넷 다 같은 인스턴스 */
        System.out.println("v2 = " + v2);
        System.out.println("add = " + add);
        System.out.println("test3 = " + test3);
        System.out.println("add2 = " + add2);

        System.out.println();
        /* 왜 이런 방식을 사용하는가? */
        /*
        * 반환 값을 변수에 담아두지 않고 즉시 사용 (이를 통해 메서드를 연결한다)
        * 이를 통해 코드를 간결하고 읽기 쉽게 만들어준다.
        * v1.add(1);
        * v1.add(2);
        * v1.add(3); ...
        *
        * StringBuilder 에서 문자열을 변경하는 대부분의 메서드가 메서드 체이닝 기법을 사용 및 제공
        * */
        ValueAdderForMethodChaining v3 = new ValueAdderForMethodChaining();
        int chainingResult = v3.add(1).add(2).add(3).getValue();

        System.out.println("chainingResult = " + chainingResult);
    }
}
