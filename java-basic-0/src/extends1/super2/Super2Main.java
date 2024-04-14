package extends1.super2;

public class Super2Main {

    public static void main(String[] args) {
        // 부모의 부모를 먼저 호출하고 최종으로 C에 실행된다.
        // => 스택 구조와 동일해 보임,
        // main 쌓이고, 클래스 C 쌓이고, 클래스 B 쌓이고, 클래스 A 쌓인다.
        // LIFO (Last In First Out 구조)
        // 즉, 상속은 스택 구조다.
//        ClassC classC = new ClassC();

        ClassB classB = new ClassB(100);

    }
}
