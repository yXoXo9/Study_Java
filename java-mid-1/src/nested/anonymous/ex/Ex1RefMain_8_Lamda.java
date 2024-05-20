package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain_8_Lamda {
    public static void hello(Ex1RefProcess pEx1RefProcess) {
        System.out.println("프로그램 시작");
        pEx1RefProcess.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(() -> {
            int i = new Random().nextInt(6) + 1;
            System.out.println("주사위 값 = " + i);
        });

        System.out.println();

        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}
