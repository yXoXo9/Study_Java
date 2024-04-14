package class1;

public class ClassStart4_Array {
    public static void main(String[] args){
        Student student1;
        student1 = new Student();// student1에 참조값을 대입 (Ox010101...)
        student1.nm = "학이름1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();// student2에 참조값을 대입 (Ox92fca1...)
        student2.nm = "학이름2";
        student2.age = 16;
        student2.grade = 80;

        /*
        ------------------------------------------------------------------------------------------------------
        **/
        // Class 인스턴스 배열 생성 시 사이즈 필수.

        /*
         자바의 =(대입)은 항상 변수에 있는 값(참조, 등)을 '복사'해서 전달한다.
         자바의 =(대입)은 항상 변수에 있는 값(참조, 등)을 '복사'해서 전달한다.
         자바의 =(대입)은 항상 변수에 있는 값(참조, 등)을 '복사'해서 전달한다.
        */

/*      Student[] arrStudents = new Student[2]; // 메모리상에 Student 클래스의 배열[2] 공간을 생성
        arrStudents[0] = student1; // 참조값 (Ox010101...)
        arrStudents[1] = student2; // 참조값 (Ox92fca1...)

        즉, student1 과 student2에 접근 방법이 한개 더 생긴 것
        arrStudents[0].nm == student1.nm
        arrStudents[1].age == student2.age

        System.out.println("1_nm : " + arrStudents[0].nm + " age : " + arrStudents[0].age + " grade : " + arrStudents[0].grade);
        System.out.println("2_nm : " + arrStudents[1].nm + " age : " + arrStudents[1].age + " grade : " + arrStudents[1].grade);

        => Refactoring, 코드 개선 (생성과 선언을 동시해 수행하여 최적화)
        Student[] arrStudents = new Student[]{student1, student2};
*/
        Student[] arrStudents = {student1, student2};

        /*for(int i = 0; i < arrStudents.length; i+=2){
            System.out.println(i+"_nm : " + arrStudents[i].nm + " age : " + arrStudents[i].age + " grade : " + arrStudents[i].grade);
        }*/

        for(int i = 0; i < arrStudents.length; i+=2){
            Student tmpS = arrStudents[i];
            System.out.println("nm : " + tmpS.nm + " age : " + tmpS.age + " grade : " + tmpS.grade);
        }
        System.out.println();
        for (Student forEachTmp : arrStudents) {
            System.out.println("nm : " + forEachTmp.nm + " age : " + forEachTmp.age + " grade : " + forEachTmp.grade);
        }

    }
}
