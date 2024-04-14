package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        // 다른 패키지 (parent. Parent Class)
        // 슈퍼 클래스로 부터 상속
        publicValue = 1;
        protectedValue = 1;
        // 다른 패키지 (parent. Parent Class)
        // 접근 불가, 컴파일 오류
//        defaultValue = 1;
//        privateValue = 1;

        /** 상속 관계 or 같은 패키지 **/
        publicMethod();
        protectedMethod();
        /** 다른 패키지 (parent. Parent Class) 접근 불가, 컴파일 오류 **/
//        defaultMethod();
//        privateMethod();
        printParent();
    }
}
