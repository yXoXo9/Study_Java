package memory;

public class JavaMemoryMain_1 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end"); // Extend selection ctrl+w (단어, 영역 선택)
//        int sum = 0;
//        sum = calculate(5);
//        System.out.println("sum = " + sum);

        /*
        스택 프레임이 비워지면 자바는 프로그램을 정리, 종료한다.

        자바는 스택 영역을 통해 메서드 호출, 지역 변수(매개변수 포함)를 관리한다.
        메서드를 호출할 때 마다 스택 프레임이 쌓인다.
        지역 변수(매개변수 포함)는 스택 영역에서 관리한다.
        스택 프레임이 종료 되면 지역 변수 제거와 함께 프로그램이 종료된다.
        */
    }

    static void method1(int m1){
        /* m1 과 cal이 스택 프레임에 포함 (지역, 매개변수 포함)*/
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2){
        System.out.println("method2 start");
        System.out.println("method2 end");
    }

//    static int calculate(int num){
//        if (num < 1){
//            return 1;
//        }else{
//            System.out.println(num + " * " + (num-1));
//            return num * calculate(num -1);
//        }
//    }
}
