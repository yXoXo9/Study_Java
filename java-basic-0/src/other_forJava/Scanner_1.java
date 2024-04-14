package other_forJava;

import java.util.Scanner;

public class Scanner_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        // 입력을 String으로 가져온다.
        // shift + f6 ( 해당 변수 명 전체 변경 )
        String chgStr = scanner.nextLine(); // 입력하는 문자열을 기다림
        System.out.println("입력한 문자열 : " + chgStr + "\n");

        System.out.print("정수를 입력하세요 : ");
        // 입력을 intValue으로 가져온다.
        int intValue = scanner.nextInt(); // 입력하는 정수를 기다림
        System.out.println("입력한 정수 = " + intValue);

        System.out.print("실수를 입력하세요 : ");
        // 입력을 doubleValue로 가져온다.
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수 = " + doubleValue);

        // ctrl + shift + enter 시 조건문 내용 자동입력
        if (true) {
            System.out.println("Ctrl + Shift + enter");
        }

        System.out.println("나이를 입력하세요 : ");
        int age = scanner.nextInt();
        scanner.nextLine(); // 숫자 입력 후의 줄 바꿈 처리
        /*
         (10 입력 후 엔터(\n)) 가 남아 있는 경우 이후 System.in 에 영향을 줌
         scanner.nextLine()을 통해 버리는 작업을 수행해야 의도한 작업이 수행 됨
        */
        System.out.println("실수를 입력하세요 : (-1 입력 시 종료)");
        double chkDoubleValue = 0;
        /*
         while(true){
            do True
         }
         */
        while ((chkDoubleValue = scanner.nextInt()) != -1) {
            System.out.println("입력 값 = " + chkDoubleValue);
            System.out.println("실수를 입력하세요 : (-1 입력 시 종료)");
        }
    }
}