package lang.clazz;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

public class SystemMain_1 {
    public static void main(String[] args) {
        // (운영체제가 사용하는 환경) 환경 변수를 읽는다.... 컬렉션 까지 알아야함....
        // Map<String, String> getenv = System.getenv();

        System.out.println("System.getenv() = " + System.getenv());
        System.out.println();

        // (자바가 사용하는 환경) 시스템 속성을 읽는다.
        Properties properties = System.getProperties();
        System.out.println("properties = " + properties);
        System.out.println("properties.getProperty(\"java.version\") = " + properties.getProperty("java.version"));
        System.out.println();

        // 배열을 고속으로 복사한다. (System 클래스를 통해...)
        char[] orgArray = {'h','e','l','l','o'};
        char[] copyArray = new char[5]; // 하나하나 복사하기엔 매우 귀찮...
        System.arraycopy(orgArray, 0, copyArray, 0, orgArray.length);
        /*
        * 자바에서, 운영체제에게
        * 하드웨어 입장에서 통째로 복사 ( 루프를 통한 수행법이 아님 최소 2배 이상은 빠름 )
        * */
        
        // 복사 후 출력
        // 참조값 출력 copyArray = [C@506e1b77
        // [(=배열) C(=character) @주소값-16진수)
        // System.out.println("copyArray = " + copyArray);
        for (char c : copyArray) {
            System.out.printf(c + "");
        }
        System.out.println();
        System.out.println("Arrays.toString(copyArray) = " + Arrays.toString(copyArray));

        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);
        System.out.println();

        // 현재 시간을(나노초)를 가져온다.
        long currentTime = System.nanoTime();
        System.out.println("nanoTime = " + currentTime);
        System.out.println();

        // 프로그램 종료 - 사용하면 안됨, (보통 프로그램 정리 후 수행하는게 일반적...)
        System.exit(0);
        System.out.println("alive...?");
    }
}
