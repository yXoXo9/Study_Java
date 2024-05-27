package exception.ex0;

import java.util.Scanner;

public class NetworkMainV0_3 {
    public static void main(String[] args) {
        NetworkServiceV0_2 networkServiceV02 = new NetworkServiceV0_2();

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
