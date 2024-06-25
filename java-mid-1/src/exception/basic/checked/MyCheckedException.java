package exception.basic.checked;

/* Exception 을 상속받은 예외는 체크 예외가 된다 => 상속 받으면 전부 체크 예외
* 예외 클래스를 만들려면 예외를 상속 받으면 가능하다.
* */
public class MyCheckedException extends Exception {
    // 오류 메시지를 받은 후 부모에 넘겨 줌
    public MyCheckedException(String message) {
        super(message);
    }
}
