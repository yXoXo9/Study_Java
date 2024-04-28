package lang.wrapper;

public class MyIntegerMethodMain_1 {
    public static void main(String[] args) {
        MyInteger_1 myInteger1 = new MyInteger_1(10);
        // int i1 = compareTo(v,5);
        // System.out.println("i1 = " + i1);

        // 자기자신(myInteger1) 의 값과 비교(compareTo)해서 결과를 얻음 (i 변수)
        // 기본형 타입을 랩퍼 클래스로 정의하여 필요한 기능을 메서드로 정의하여 활용할 수 있음.
        int i = myInteger1.compareTo(5);
        int i1 = myInteger1.compareTo(10);
        int i2 = myInteger1.compareTo(20);
        System.out.println("i = " + i);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
    }
}
