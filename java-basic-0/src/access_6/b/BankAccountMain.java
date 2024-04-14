package access_6.b;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);

        System.out.println("Main_Balance = " + account.getBalance());

        // isAmountValid (유효한 값을 체크하는 로직) 외부에 노출하게 되면..?
        /*
        * 1. 클래스를 개발한 제작자가 의도하지 않은 개발 방향 발생 (검증 로직은 이미 클래스 내부에 있음)
        * 2. 제 3자(유지보수 혹은 레거시소스를 인수받은 경우)의 경우 제공하는 메서드로 인해
        * 여러가지 가능성을 열어두고 코드를 작성
        * 3. 클래스 내부에도 사용하네....? 사용자도 해야하는건가?
        *
        *  더 최악 => 멤버변수 balance(잔고)까지 public 제공
        *
        * 여기 클래스를 예로 들면,
        * 개발자가 검증한 로직이 깨지고, 캡슐화가 무너지며
        * 이로 인해 잔고가 무한정 늘어나고 출금하는 심각한 문제가 발생할 수 있다.
        * ===>
        * */
        int amount = 10;
        boolean isTure = account.isAmountValid(amount);
        if (isTure){
            account.deposit(100);
        }else{
            account.getBalance();
        }

        account.withdraw(50);
        account.getBalance();
    }
}
