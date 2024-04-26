package lang.string.method;

public class StringChangeMain_2 {
    public static void main(String[] args) {
        String strWithSpaces = "           Test Programming ";

        System.out.println("소문자 : " + strWithSpaces.toLowerCase());
        System.out.println("대문자 : " + strWithSpaces.toUpperCase());

        System.out.println("trim() 공백제거 : " + strWithSpaces.trim());
        System.out.println("strip() 공백 및 유니코드 공백 제거 : " + strWithSpaces.strip());
    }
    /*
    * String str = "A" + "B" + "C" + "D";
    * ... => 3개의 String 클래스가 생성
    * new String(AB) ,new String(ABC), str
    * 쓸모 없는 GC 대상의 발생 => 시스템 자원, 메모리의 낭비
    * (+ 실제로는 자바가 내부 최적화를 수행... 이후 학습)
    *
    * ! StringBuilder (가변 String) ! - 불변이 아닌 가변 String 으로 활용하자.
    * => 내부의 값을 바로 변경 (성능 및 메모리 활용 면에서 불변보다 효율적)
    * public final class StringBuilder
    *   extends AbstractStringBuilder
    *   implements java.io.Serializable, Comparable<StringBuilder>, CharSequence
    *  {
    *   AbstractStringBuilder ...
    *       char[] value; // 이전 char // java 9 이전
    *       byte[] value; // 이후 byte // java 9 이후
    *   final 이 제외되어 있음
    * */
}
