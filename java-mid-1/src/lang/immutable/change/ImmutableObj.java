package lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // final 변수로 인한 setter 생성 불가

    public ImmutableObj add(int addValue){
        // int result = value + addValue;
        // 변수(result)에 포커스 후 ctrl + alt + n => Inline variable

        /* 이로 인해 사용자는 불변 객체를 사용할 뿐만 아니라
        * 값을 더하더라도 사이드 이펙트를 신경쓰지 않아도 됨
        * */
        return new ImmutableObj(value + addValue);
    }

}
