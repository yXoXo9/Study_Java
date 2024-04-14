package class2_ref;

public class NullMain1_forGC {
    public static void main(String[] args){
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data(); // (2) constants pool 영역에 할당
        System.out.println("2. data = " + data);
        data = null; // null 을 입력함으로서, (2) 참조값이 저장된 메모리 공간 ~> GC 대상
        /*
         JVM 에서 동작,
         Garbage Collection - 아무도 참조하지 않는 인스턴스를 제거

         개발자가 삭제하는 코드를 누락하거나 무분별하게 생성할 경우
         프로그램이 종료되지 않는이상 제거되지 않음,
         메모리 공간 낭비 => Out of memory error 발생

         C, Java 중요한 차이
         - C는 수동으로 인스턴스 관리 (메모리 할당 및 제거)
         - Java는 아무도 참조하지 않는 인스턴스가 있으면, JVM의 Garbage Collection에서
            사용하지 않는 인스턴스로 판단하고 자동으로 메모리에서 제거함.

           ! 하지만 무분별한 객체 생성은 JVM이 종료할 때 까지 계속 생존한다. => 메모리 낭비
         * (지역, 전역) 변수(리터럴, 객체, 인스턴스) 스코프에 대한 중요성
        * */
        System.out.println("3. data = " + data);

        /* NullPointerException
        * 객체, 인스턴스가 null (참조값이 없는 상황)
        * Data tmpObj = new Data();
        * tmpObj = null;
        * tmpObj.value = 10; == null.value = 10;
        * null.(Pointer)Exception;
        * */
    }
}
