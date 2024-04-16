package lang.object.tostring;

public class ToStringMain_1 {
    public static void main(String[] args){
        Object o = new Object();
        /*
        * public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        *
        * hashCode()
        * =>    패키지를 포함하는 객체의 이름 및 참조값을,
        *       Integer.toHexString(16진수(해시코드))로 제공
        * */
        String st = o.toString();

        // toString() 반환 값 출력
        // java.lang.Object(class 타입) @b4c966a (참조 값)
        System.out.println("st = " + st);
        System.out.println(); // ctrl + p 파라메터 인포 리스트 (사용가능 파라메터)

        /* println 내부엔 이미 toString() 이 사용중,
        * public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
          }
          즉, 굳이 toString()을 호출하지 않아도 됨,
            =>  then = java.lang.Object@1d81eb93
                System.out.println("then = " + new Object());
        * */

        // String st 와 Object o 의 참조대상이 같음, (Object)부모로 부터 상속

        // Object 직접 출력
        // java.lang.Object(class 타입) @b4c966a (참조 값)
        System.out.println("o = " + o);
    }
}
