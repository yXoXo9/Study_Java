package lang.object;

/* 명시적 상속 Parent 시 Object 를 상속 받지 않는다.
    (상속은 단 하나의 부모)
 */
public class Child extends Parent{
    public void childMethod(){
        System.out.println("Child.childMethod");
    }
}
