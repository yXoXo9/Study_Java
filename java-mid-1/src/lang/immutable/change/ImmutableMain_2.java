
package lang.immutable.change;

public class ImmutableMain_2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);

        // return 값을 사용하지 않는 상태 => 그냥 버리는 결과
        // obj1.add(20); => ctrl + alt + v (extract/Introduce variable)

        System.out.println("obj1.getValue() = " + obj1.getValue());

        /*
        * 불변 객체의 변경과 관련된 메서드는
        * 보통 새로 객체를 만들어서 반환한다.
        * 즉, 반환 값을 통해 처리할 수 밖에 없음
        * */
        ImmutableObj rtnObj = obj1.add(20);
        System.out.println("rtnObj.getValue() = " + rtnObj.getValue());

    }
}
