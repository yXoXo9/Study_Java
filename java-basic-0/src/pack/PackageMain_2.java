package pack;
// import ....
//import pack.a.User;
// a. 패키지 하위 전체 사용.... 좋아보이지 않음
import pack.a.*;

public class PackageMain_2 {
    public static void main(String[] args){
        Data d = new Data();
        User us = new User(); // import 선언되어 패키지 명 생략 가능
//        User2 us2 = new User2();
//        같은 이름의 클래스의 경우 패키지 경로를 전체로 지정해줘야함
//        pack.b.User us = new pack.b.User();

        /*
        * Package Rule
        * .....
        * 패키지 이름은 모두 소문자를 사용한다. (관례)
        * 패키지 이름 앞 부분에는 일반적으로 회사 도메인 이름을 거꾸로 사용한다.
        * ex) com.company.myapp 같이 사용한다. (관례) aaa.company.com
        * 필수는 아니지만 많은 외부 라이브러리가 사용되면 같은 패키지안에 같은 클래스 이름이 존재할 수 있음
        * 도메인 이름을 거꾸로 사용하여 문제를 방지할 수 있다.
        *
        * 오픈소스나 라이브러리를 외부에 제공한다면 꼭 지켜야 될 사항
        *
        * 패키지는 계층 구조를 이루지만 사람이 이해하기 쉽게 구현된 모습일 뿐
        * 컴퓨터가 이해하기엔 아무런 관계 없는 패키지다.
        * a/
        * a.b
        * a.c
        *  => 독립적인 3개의 패키지,
        *
        *
        * */
    }
}
