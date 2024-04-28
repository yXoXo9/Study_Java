package lang.wrapper;

public class MyInteger_1 {

    private final int value;

    public MyInteger_1(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public int compareTo(int t){
        if (value < t){
            return -1;
        } else if (value > t){
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        // return "" + value;
        return String.valueOf(value); // 숫자를 문자로 변경
    }
}
