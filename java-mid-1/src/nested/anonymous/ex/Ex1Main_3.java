package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main_3 {
    public static void helloDice() {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        int i = new Random().nextInt(6) + 1;
        System.out.println("주사위 값 = " + i);
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void helloSum() {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    private static class innerMerge {

        /**
         *  @param  strFlag "dice" or "sum"
         *  */
        public innerMerge(String strFlag) {
            switch (strFlag){
                case "dice" :
                    doDice();
                break;
                case "sum" :
                    doSum();
                break;
                default: break;
            }

        }

        private static void doDice(){
            int i = new Random().nextInt(6) + 1;
            System.out.println("주사위 값 = " + i);
        }

        private static void doSum(){
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void helloMerge(String strFlag){
        System.out.println("프로그램 시작");
        new innerMerge(strFlag);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloMerge("dice");
        System.out.println();
        helloMerge("sum");
    }
}
