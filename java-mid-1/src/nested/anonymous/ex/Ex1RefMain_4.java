package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain_4 {
    public static void helloDice() {
        System.out.println("프로그램 시작");
        // 코드 조각 시작
        /*int i = new Random().nextInt(6) + 1;
        System.out.println("주사위 값 = " + i);*/
        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }

    public static void helloSum() {
        System.out.println("프로그램 시작");
        // 코드 조각 시작
        /*for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }*/
        // 코드 조각 종료
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
        helloDice();
        System.out.println();
        helloSum();
    }
}
