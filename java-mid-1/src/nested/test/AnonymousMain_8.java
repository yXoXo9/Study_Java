package nested.test;

public class AnonymousMain_8 {
    public static void main(String[] args) {
        Hello_7 hello7 = () -> System.out.println("Hello7.hello");
        hello7.hello();
    }
}