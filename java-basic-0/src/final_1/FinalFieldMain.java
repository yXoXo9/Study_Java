package final_1;

public class FinalFieldMain {

    public static void main(String[] args) {
        //final 값을 한번 넣는경우 변경할 수 없다.

        //final field - constructor init
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        // constructInit2.value = 30; // Cannot assign a value to final variable 'value'

        System.out.println("constructInit1 = " + constructInit1.value);
        System.out.println("constructInit2 = " + constructInit2.value);

        // final field init
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println("fieldInit1 = " + fieldInit1.value); // 바꿀 수 없는 final 변수 인데...
        System.out.println("fieldInit2 = " + fieldInit2.value); // 표기가 이런식이면 바꿀 수 있어보임
        System.out.println("fieldInit3 = " + fieldInit3.value); // 힙 영역에만 존재하는 필드일 뿐

        // => 인스턴스의 값이 모두 같은 값을 사용하고 있는 경우 => 내부 최적화를 시도하지 않는 이상 힙 영역 메모리 낭비..
        // => 이럴 때 사용하면 좋은 것이 바로 static 영역

        // Constant => 관례 표기
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
        // ex 10이란 숫자가 필요할 때 위에 스태틱 상수를 쓰면 된다.

        // 8_(2) 왜 상수라고 불리는가?
        // 상수 : 변하지 않고 항상 일정한 값을 갖는 수.
        // 자바에선 단 하나만 존재하는 변하지 않는 고정 값을 상수라고 칭한다.
        // => static final 'STATIC_FINAL_VARIABLE' => 관례(일반적인 변수와 구분하기 위해 사용)
        // 1. 상수를 선언하는 이유는, 고정된 값 자체를 사용하는 것이 목적이다.
        // 2. 필드를 직접 접근해서 사용한다
        // 값을 변경할 수 없음, 따라서 필드에 직접 접근해도 데이터는 변하지 않는다.


    }
}
