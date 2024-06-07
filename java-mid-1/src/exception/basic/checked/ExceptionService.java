package exception.basic.checked;

public class ExceptionService {
    ExceptionClient_2 exceptionClient_2 = new ExceptionClient_2();
    /* public void callCatch() throws MyCheckedException{
     * 예외가 발생 시 할 수 있는 대처 방법 2가지
     * 1) 예외를 잡아서 처리 하는 코드
     * */
    public void callCatch() {
        try { // 던져진 Exception 이 포함된 메서드를 실행(try) 하여
            exceptionClient_2.call(); // 에러 발생 시 => new throw MyCheckedException("excep"); 와 동일한 모습으로 예외가 실행된다고 생각...
        } catch (MyCheckedException e){
            // Exception 이 실행될 경우 (catch)처리
            // 예외 처리 로직 - 불을 끄는 로직 - 에러를 처리하는 로직 수행
            System.out.println("ExceptionClient_2에서 catch 문을 통한 exception 예외 처리, exception.getMessage() = " + e.getMessage()); // getMessage 는 Exception 을 상속받은 메서드 Exception
        }
        System.out.println("정상 흐름");
    }

    /*
    * 2) 예외를 처리하지 않고 밖으로 던지는 코드 (throws 선언이 필수)
    * */
    public void catchThrows() throws MyCheckedException { // => MyCheckedException 이 발생하게 되면 밖으로 던진다는 의미
        exceptionClient_2.call();
    }
}
