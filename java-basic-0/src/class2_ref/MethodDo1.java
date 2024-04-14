package class2_ref;

public class MethodDo1 {
    public static void main(String[] args) {
        /*
        * '참조형'은 메서드의 인수로 전달 시 '참조값'을 대입해서 '전달',
        * 메소드의 매개변수로 전달된 참조값을 통해 실제 메모리에 저장된 인스턴스를 찾아가서 값을 변경하거나 읽어서 사용한다.
        * */
//      Student student2 = new Student();
//      initStudent(student2, "학생2", 16, 80);

        /*
        1. createStudent 를 수행하여 Student 인스턴스를 반환 후
        2. student1 변수에 대입한다.
        * */
        Student student1 = createStudent("학생1", 15, 90);
        System.out.println("student1 = " + student1);
        /* 인스턴스 변경 후 출력 */
        printStudent(student1);

        System.out.println();

        Student student2 = createStudent("학생2", 16, 80);
        System.out.println("student2 = " + student2);
        printStudent(student2);
    }
    static Student createStudent(String name, int age, int grade) {
        /* createStudent 를 통해
        * 1.객체 생성 (initStudent 기능에 하나 더 추가 됨)
        * 2.객체의 초기값 설정
        * 작업을 처리한다.
        * */
        Student tmpStudent = new Student();
        System.out.println("tmpStudent = " + tmpStudent);
        tmpStudent.name = name;
        tmpStudent.age = age;
        tmpStudent.grade = grade;

        return tmpStudent; // Student 인스턴스를 반환
    }

    static void initStudent(Student paramStudent, String name, int age, int grade) {
        // String name, int age, int grade 는 지역변수이자 매개변수, 파라미터
        paramStudent.name = name;
        paramStudent.age = age;
        paramStudent.grade = grade;
    }

    public static void printStudent(Student paramStudent){
        System.out.println("이름: " + paramStudent.name + ", 나이: " + paramStudent.age + ", 성적: " + paramStudent.grade);
    }
}
