package enumeration.test.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthGrade[] values = AuthGrade.values();
        String inputGrade = "";

        // valueOf 을 통한 열거형 변환
        // int level = AuthGrade.valueOf(inputGrade).getLevel();
        // String description = AuthGrade.valueOf(inputGrade).getDescription();
        // System.out.println("확인 : " + inputGrade + " level : " + level + " description : " + description);
        while(!inputGrade.equals("x")){
            System.out.print("당신의 등급을 입력하세요" + Arrays.toString(values) + ": ");
            inputGrade = sc.next();

            AuthGrade.showGrade(inputGrade);
            AuthGrade.showMenuByGrade(inputGrade);
            System.out.println();
        }

        // Menu.valueOf("GUEST");
    }
}
