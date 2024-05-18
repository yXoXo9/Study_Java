package nested.anonymous.ex;

public class Ex0RefMain_2 {
    /*
    public static void helloJava() {
        System.out.println("프로그램 시작"); // 1.변하지 않는 부분 파악
        System.out.println("Hello Java");  // 2.변하는 부분 파악
        System.out.println("프로그램 종료"); // 1.변하지 않는 부분 파악
    }
    public static void helloSpring() {
        System.out.println("프로그램 시작");
        System.out.println("Hello Spring");
        System.out.println("프로그램 종료");
    }
    */

    /*
    * 3.변하는 부분을 외부에서 전달받아 메서드 내부를 구현하는 것
    * */
    public static void hello(String methodBody){
        System.out.println("프로그램 시작");
        System.out.println(methodBody);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello("Hello Java");
        System.out.println();
        hello("Hello Spring");
    }
}
