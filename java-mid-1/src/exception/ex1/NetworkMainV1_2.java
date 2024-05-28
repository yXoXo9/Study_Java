package exception.ex1;

import java.util.Scanner;

public class NetworkMainV1_2 {
    public static void main(String[] args) {
        // NetworkServiceV1_1 networkServiceV02 = new NetworkServiceV1_1();
        // NetworkServiceV1_3 networkServiceV02 = new NetworkServiceV1_3();
        NetworkServiceV1_4 networkServiceV02 = new NetworkServiceV1_4();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("메시지 입력 : ");
            String inputString = scanner.nextLine();
            if(inputString.equals("x")){
                break;
            }
            networkServiceV02.sendMessage(inputString);
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
