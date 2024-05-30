package exception.basic.checked;

public class ExceptionService {

    ExceptionClient_2 exceptionClient_2 = new ExceptionClient_2();

    /*
    * 예외를 잡아서 처리 하는 코드
    * */
    // public void callCatch() throws MyCheckedException{
    public void callCatch() {

        try {
            // 던져진 Exception 이 포함된 메서드를 실행하여
            exceptionClient_2.call(); // =>  new throw MyCheckedException("excep");
        } catch (MyCheckedException e){
            // Exception 이 실행될 경우 처리 (catch)
            // 예외 처리 로직
            System.out.println("에외 처리, Message = " + e.getMessage()); // getMessage 는 Exception 을 상속받은 메서드 Exception
        }

    }
}
