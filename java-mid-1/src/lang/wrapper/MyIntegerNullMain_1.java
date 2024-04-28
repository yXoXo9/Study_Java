package lang.wrapper;

public class MyIntegerNullMain_1 {
    public static void main(String[] args) {
        MyInteger_1[] intArr = {
                new MyInteger_1(-1),
                new MyInteger_1(0),
                new MyInteger_1(1),
                new MyInteger_1(2),
                new MyInteger_1(3)};

        // 값을 못찾은 경우와 찾는 값에 의미가 중복되는 상황..
        // 기본형의 경우 null 이라는 값을 반환할 수 없다.
        System.out.println("Find = " + findValue(intArr, -1));
        System.out.println("Find = " + findValue(intArr, 0));
        System.out.println("Find = " + findValue(intArr, 1));
        System.out.println("Find = " + findValue(intArr, 100));
    }

    private static MyInteger_1 findValue(MyInteger_1[] intArr, int tgt){
        for (MyInteger_1 myInt : intArr){
            // 찾으려는 값을 발견한 경우, 해당 값 리턴
            if(myInt.getValue() == tgt){
                return myInt;
            }
        }
        // return -1;
        // 값을 못찾는 경우
        return null;
    }
}
