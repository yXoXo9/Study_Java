package class1;

public class ClassStart3 {
    public static void main(String[] args){
        /*
        클래스를 통해 int, char, double, long 등의 자료형을
        String, Student 같은 클래스 타입으로 만들 수 있다.
-------------------------------------------------------------------------------------------------------------------
        String constants pool (heap Area) 리터럴 값, literal value, 자료형의 값을 직접 표현하는 방식
        String literalValueNm = "리터럴 값" 직접 표현
        String "리터럴 값" (리터럴 = final = 상수)

        JVM(자바 가상 머신) - Heap Area의 Perm/Metaspace 영역에 존재하고 (Java8 에선 Perm 영역이 삭제되어 MetaSpace 영역으로 전환)
        왜 ?
        JDK 7 이하는
        고정된 Perm 영역의 크기로 인해 메모리 부족으로 OOME(Out of Memory Error), 즉 메모리 누수 현상이 발생
        Class, Metadata 로딩 과정에서 Memory Leak이 발생
-------------------------------------------------------------------------------------------------------------------
Q. Memory Leak?
    개발자가 동적으로 할당한 메모리를 free(해제)할 수 없는 상태가 된 것
        왜 동적으로 할당한 메모리를 해제할 수 없나 ?

    // By C
    char *a = malloc(20);    // 포인터 변수 a에 동적 메모리 할당
    char *b = malloc(10);    // 포인터 변수 b에 동적 메모리 할당

    b = a;    // b가 가지고 있던 주소값을 a에 할당

    free(a);  // 포인터 a에 할당한 20바이트의 메모리를 해제
    free(b);  // 포인터 b에 할당한 10바이트의 메모리가 아닌 a에 할당한 20바이트 메모리 해제

    // 포인터 b에 할당했던 10바이트 메모리가 할당 해제 될 수 없는 상태가 됨(memory leak 발생)
-------------------------------------------------------------------------------------------------------------------
Q. Metaspace영역은 JVM의 Native Memory, Heap 영역의 바깥인 Off-Heap 공간을 사용하고
    JVM 시스템의 기본 메모리이며 JVM이 관리한다.
    Perm영역과의 결정적인 차이가 바로 JVM이 관리하는 것을 통해,
    메모리가 JVM을 통해 Metaspace영역은 동적으로 관리되며 필요할 경우 OS에게 요청하여 메모리를 추가 할당할 수 있습니다.
    이를 통해 OOM을 개선할 수 있었습니다.

    일반적인 GC 대상이 아니다.
    String 객체는 immutability (불변성)을 갖고 있다.
    객체 선언 시 Heap Area에 적재되면 개발자가 삭제할 수 없고
    새롭게 선언을 하더라도 신규로 저장됨
-------------------------------------------------------------------------------------------------------------------
        용어 정의
        "클래스(=(1.멤버 변수, 필드)와 2.기능으로 구성, 정의 )" = 객체 또는 인스턴스를 만들 수 있는 "설계도"
        설계도(클래스)를 통해 실제 메모리에 만들어진 "실체(내용물)"을 "객체, 인스턴스" 라고 정의

        Class newClassNm = new Class(); 객체, 인스턴스를 위한 메모리 공간을 선언 즉, 객체, 인스턴스 생성
         */
        Student student1;
        student1 = new Student();
        student1.nm = "학1";
        student1.age = 15;
        student1.grade = 90;

        /*
        객체 = Student1은 학생 속성을 갖는 객체1, Student2는 학생 속성을 갖는 객체 2
        같은 설계도(클래스)를 보고 만들었지만 서로 다른 객체다.

        인스턴스 = 특정 설계도(클래스)를 통해 생성된 객체를 의미하지만,
        설계도(어디 클래스에 속해 있는지)를 명시할 때 사용한다. => student1은 Student 설계도의 인스턴스다.
        student2는 인스턴스다. Student 클래스의
        student2는 객체다.
         */
        Student student2 = new Student();
        /*
        new 로 '객체 생성' 후,
         생성된 객체를 '접근하려면' 참조값을 변수에 담는다.
         */
        // 패키지명.클래스명.참조값(16진수 주소..)
        System.out.println("student2 = " + student2);
        student2.nm = "학2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("1_nm : " + student1.nm + " age : " + student1.age + " grade : " + student1.grade);
        System.out.println("2_nm : " + student2.nm + " age : " + student2.age + " grade : " + student2.grade);
    }
}
