package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 어디서 왔는가..? Object 클래스의 메서드를 상속받아 사용
        String string = child.toString(); // > 객체에 대한 정보를 출력해줌

        System.out.println("상속 = " + string);
        // 상속 = lang.object.Child@4e50df2e
        // 클래스에 대한
    }
}
