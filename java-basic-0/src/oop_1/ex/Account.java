package oop_1.ex;

public class Account {
    int balance;

    // 입금
    void deposit(int amount){
        balance += amount;
    }

    // 출금
    void withdraw(int amount){
        if(amount > balance){
            System.out.println("잔액 부족");
        }else {
            balance -= amount;
        }
    }
    // 잔고
    void viewAmount(){
        System.out.println("잔고: " + balance);
    }

}
