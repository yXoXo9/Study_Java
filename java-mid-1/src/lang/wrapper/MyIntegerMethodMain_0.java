package lang.wrapper;

public class MyIntegerMethodMain_0 {
    public static void main(String[] args) {
        int v = 10;

        int i1 = compareTo(v,5);
        System.out.println("i1 = " + i1);
        int t2 = compareTo(v, 10);
        System.out.println("t2 = " + t2);
        int t3 = compareTo(v, 20);
        System.out.println("t3 = " + t3);
    }
    
    /*
    * 외부 사용자 정의 메서드 (compareTo)를 사용해 값을 비교.....
    * => v 가 객체였다면 객체 내부 메서드로 정의해서 사용하는 것이
    * 개발자, 사용자, 유지보수, 캡슐화 등 다양한 방향에서 더 유용할 것이다
    * (ex_ v.compareTo(v, 10).... 불가)
    *
    * => int 를 클래스 처럼 만들어보자.
    * 이렇게 특정 기본형을 감싸서(Wrap) 만드는 클래스를 래퍼(WrapperClass)라고 한다.
    * */
    public static int compareTo(int v, int t){
        if (v < t){
            return -1;
        } else if (v > t){
            return 1;
        } else {
            return 0;
        }
    }
}
