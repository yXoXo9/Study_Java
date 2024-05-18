package nested.anonymous.ex;

public class Ex0Main_1 {
    public static void helloJava() {
        System.out.println("프로그램 시작");
        System.out.println("Hello Java");
        System.out.println("프로그램 종료");
    }
    public static void helloSpring() {
        System.out.println("프로그램 시작");
        System.out.println("Hello Spring");
        System.out.println("프로그램 종료");
    }

    public static void helloMerge(String methodBody){
        System.out.println("프로그램 시작");
        System.out.println(methodBody);
        System.out.println("프로그램 종료");
    }

    /*
    * 두개의 메서드가 존재,
    * 위에 소스를 확인해보면 중복되는 부분이 보임
    * 두개를 하나로 통합하려는 경우 어떻게 처리하면 될까
    * */
    public static void main(String[] args) {
        // helloJava();
        helloMerge("Hello Java");
        System.out.println();
        helloMerge("Hello Spring");
        // helloSpring();
    }
}
