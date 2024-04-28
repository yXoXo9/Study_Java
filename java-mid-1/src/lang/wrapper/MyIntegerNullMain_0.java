package lang.wrapper;

public class MyIntegerNullMain_0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};

        // 값을 못찾은 경우와 찾는 값에 의미가 중복되는 상황..
        // 기본형의 경우 null 이라는 값을 반환할 수 없다.
        System.out.println("Find = " + findValue(intArr, -1));
        System.out.println("Find = " + findValue(intArr, 0));
        System.out.println("Find = " + findValue(intArr, 1));
        System.out.println("Find = " + findValue(intArr, 100));
    }

    private static int findValue(int[] intArr, int tgt){
        for (int v : intArr){
            // 찾으려는 값을 발견한 경우, 해당 값 리턴
            if(v == tgt){
                return v;
            }
        }

        return -1;
    }
}
