package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain_4 {
    public static void hello(Ex1RefProcess pEx1RefProcess) {
        System.out.println("프로그램 시작");
        pEx1RefProcess.run();
        System.out.println("프로그램 종료");
    }

    static class Dice implements Ex1RefProcess{
        @Override
        public void run() {
            int i = new Random().nextInt(6) + 1;
            System.out.println("주사위 값 = " + i);
        }
    }

    static class Sum implements Ex1RefProcess{
        @Override
        public void run() {
           for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
           }
        }
    }

    public static void main(String[] args) {
        hello(new Dice());
        System.out.println();
        hello(new Sum());
    }
}
