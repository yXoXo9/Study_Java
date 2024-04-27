package lang.string.chaining;

public class ValueAdderForMethodChaining {
    /*
    * 메서드 체이닝(Method Chaining)에 대해 확인
    * */
    private int value;

    public ValueAdderForMethodChaining add(int addValue){
        value += addValue;
        return this;
    }

    public int getValue(){
        return value;
    }
}
