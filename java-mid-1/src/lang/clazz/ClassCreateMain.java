package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        // Class helloClass = Hello.class;
        // 사용자의 문자를 입력받아("lang.clazz.Hello") 클래스를 생성..
        Class aClass = Class.forName("lang.clazz.Hello");

        /*
        * 아래와 같은 작업을(Class 클래스를 사용해 메타 정보를 조회 후 인스턴스 생성 및 메서드 호출)
        * 리플렉션 - reflection 이라고 얘기하며
        * 추가적으로 어노테이션 정보를 읽은 후
        * 특별한 기능을 수행할 수 있다. - 최신 프레임워크는 이런 기능을 적극 활용
        * 현재는 리플렉션보다는 기본기 (Class 클래스가 뭔지, 어떤 기능을 제공하는지)
        * 에 충실하게 학습하자. - 리플렉션은 자바를 충분히 다 배우고 난 후 이후에 배워도 충분하다...
        * */
        // Hello createHello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        Hello createHello = (Hello) aClass
                .getDeclaredConstructor() // 생성자 선택
                    .newInstance(); // 선택된 생성자를 기반으로 인스턴스를 생성
        String helloMethod = createHello.hello();
        System.out.println("helloMethod = " + helloMethod); 
    }
}
