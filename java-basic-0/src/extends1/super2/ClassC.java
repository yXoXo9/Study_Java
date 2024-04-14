package extends1.super2;

public class ClassC extends ClassB {

    public ClassC(){
        // Class B 에서 기본 생성자 호출........ 인데
//        super(); // Class B 에서 이미 정의한 생성자가 두개이므로 컴파일 오류 발생 (어떤 생성자를 호출하는지 명시필요)
//        직접 정의한 생성자가 하나라도 있으면 그 생성자를 호출해야 함.
//
        super(10, 20);
        System.out.println("ClassC 생성자 호출");
    }
}
