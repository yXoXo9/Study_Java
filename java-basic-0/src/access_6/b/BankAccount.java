package access_6.b;

public class BankAccount {
    // 캡슐화가 잘 되어있는 Class 제작
    private int balance;

    // hot key // Generate => Alt + Insert;
    // 기본 생성자 생성
    public BankAccount() {
        balance = 0; // 굳이 없어도 되긴 함 int 형 멤버변수이기 때문
        // => 여기선 public 접근제어자를 확인하기 위해서 ...
    }

    // public 메서드 : deposit
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        }else{
            System.out.println("유효하지 않은 금액 (" + amount + ") 입니다.");
        }
    }

    // public 메서드 : withdraw
    public void withdraw(int amount){
        if (isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        } else{
            System.out.println("유효하지 않은 금액 (" + amount + ") 이거나, 잔액("+balance+")이 부족합니다.");
        }
    }

    // public 메서드 : getBalance()
    public int getBalance(){
        System.out.println("class.getBalance_잔액은 : " + balance);
        return balance;
    }

    // 들어온 금액이 제대로 된 값인지 검증하는 클래스 내부 로직 (외부에 공개하지 않음)
//    private boolean isAmountValid(int amount){
    public boolean isAmountValid(int amount){ // 무분별한 public 제공을 테스트 Main.L11 이어짐
        // 금액이 0 보다 커야함
        return amount > 0;
    }
}
