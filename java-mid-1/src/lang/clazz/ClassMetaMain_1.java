package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain_1 {
    public static void main(String[] args) throws Exception {
        // Class 조회
        /*
        현재는 제네릭 제외
        Class<String> stringClass = String.class;
        */

        Class clazz = String.class; // 1. 클래스 조회
        // Class clazz = new String().getClass(); // 2. 인스턴스에서 조회
        // 3. 클래스 정보를 문자열로 조회 _ 아래 케이스는 Exception 필요
        // Class aClass = Class.forName("java.lang.String");

        // (해당 클래스의) 모든 필드를 출력
        System.out.println("- 필드 -");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields){
            System.out.println("type / Name = " + field.getType() + " / " + field.getName());
            /* System.out.println("field = " + field);
            * field = private final byte[] java.lang.String.value
            * field = private final byte java.lang.String.coder
            * field = private int java.lang.String.hash
            * field = private boolean java.lang.String.hashIsZero
            * field = private static final long java.lang.String.serialVersionUID
            * field = static final boolean java.lang.String.COMPACT_STRINGS
            * field = private static final java.io.ObjectStreamField[] java.lang.String.serialPersistentFields
            * field = private static final char java.lang.String.REPL
            * field = public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER
            * field = static final byte java.lang.String.LATIN1
            * field = static final byte java.lang.String.UTF16
            * */
        }
        System.out.println("- 메서드 -");
        // (해당 클래스의) 모든 메서드 출력
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            // System.out.println("method = " + method);
            System.out.println("method = " + method.getName());
        }

        // (해당 클래스의) 상위 클래스 정보 출력
        System.out.println("- 상위 클래스 정보 -");
        System.out.println("clazz.getSuperclass().getName() = " + clazz.getSuperclass().getName());
        
        // (해당 클래스의) 인터페이스 정보 출력
        System.out.println("- 인터페이스 정보 -");
        Class[] interfaces = clazz.getInterfaces();
        for (Class ci : interfaces){
            System.out.println("ci = " + ci.getName());
        }
    }
}
