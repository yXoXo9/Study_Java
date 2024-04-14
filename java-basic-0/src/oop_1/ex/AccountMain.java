package oop_1.ex;

public class AccountMain {
    public static void main(String[] args){
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
//        account.viewAmount(); balance 를 확인해도 됨...
        System.out.println("잔고: " + account.balance);

        /*
        * 절차 지향 (순서, 절차를 중요하게 여기는 방식)
        * "어떻게" 중심으로 구성 된 흐름을 순차적으로 따르며 처리하는 방식.
        *
        * 객체 지향 (객체안에 멤버변수, 필드를 입력하면 내부 메소드를 통해 완성품처럼 동작)
        * "무엇을" 중심으로 프로그래밍 한다. 객체 하나로 상호 작용을 할 수 있도록
        *
        * */
    }
}
