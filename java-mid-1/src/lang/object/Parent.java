package lang.object;

// 부모(extends)가 없을 시 묵시적으로 Object 클래스를 상속 받음
// public class Parent extends Object (생략 권장){
public class Parent {

    public void parentMethod(){
        System.out.println("Parent.parentMethod");
    }
}
