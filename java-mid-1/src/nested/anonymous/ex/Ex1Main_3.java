package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main_3 {
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
        new innerMerge(strFlag); // 근본적으로 해결되지 않음 => 문자열 값은 무엇이든 들어올 수 있다.
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloMerge("dice");
        System.out.println();
        helloMerge("sum");
    }
}
