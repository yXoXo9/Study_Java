package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;
    /* 클래스(설계도) 인스턴스화 원칙
    * 1. 클래스를 new Class() 인스턴스화 할 경우 생성자(Constructor)는 반드시 호출 되어야 한다.
    * 2. 생성자가 없으면 기본 생성자가 제공되며,
    * 3. !! 생성자가 하나라도 있으면 !! 기본 생성자는 제공되지 않는다.
    * 3-1. 이 경우 개발자가 정의한 생성자를 직접 호출해야 한다.
    * */

    /* "기본생성자" = 매개변수가 없는 생성자
    *  !!! 중요 !!!
    * 생성자가 하나라도 있으면!! 자바는 기본 생성자를 만들지 않는다.
    *  */
    MemberConstruct(){}

    /* 생성자 도입
    * initMamber 메소드 처럼 만들어보자.
    * 생성자는 메서드와 비슷하지만 다음과 같은 차이가 있다.
    * 생성자의 이름은 클래스 이름과 같아야 한다.
    *   따라서 첫 글자도 대문자로 시작한다.
    * ! 생성자는 반환 타입이 없다. ! 비워두어야 한다. !
    * 나머지는 메서드와 같다.
    */
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 생성자 오버로딩
    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50; // 성적 고정
        /* this()
         * 생성자 안에서만 쓸 수 있음
         * 생성자 안에서 오버로딩한 다른 생성자를 호출할 수 있다.
         * => 이를 통해 중복 코드를 제거 가능
         * 규칙 1. this()는 생성자 코드 첫 줄에만 작성할 수 있다.
         */
        this(name, age, 50);
        System.out.println("생성자 오버로딩");
    }

}
