package oop_1;

public class ValueData {
    int value;

    /*
     ValueData(기준정보, 개념)클래스 안에
     1. 멤버변수, 필드(변화하는 값, 조절 등)
     2. 기능(행위 및 동작)
     을 정의
     객체를 생성해야 쓸 수 있는게 당연함으로 Static을 선언하지 않음
     (정적 메모리 공간 생성)
     Runtime Constants Pool가 아님,

     JVM, Metaspace 에 각 Class MetaData 가 프로그램 기동 시 Classloader 에 의해 생성됨

     즉, 객체를 생성해서 사용하면 됨으로
     왜?
     모든 객체와 행위에 대해 필요할 때만 객체를 선언해서 사용하고,
     항상 정적으로는 저장해 두지 않아도 된다. => 필요 없을때도 메모리 공간을 차지하고 있으므로 낭비

     서버 실행 시, Classloader 가 로드한 class 들의 MetaData 를
     Heap 외부의 Native Memory 영역 중 하나인 Metaspace 에 저장 됨
     */
    void add(){
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
