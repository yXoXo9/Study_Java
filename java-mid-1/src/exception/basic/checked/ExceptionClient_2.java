package exception.basic.checked;

public class ExceptionClient_2 {

    // 해결 못할 시 밖(하기 메서드를 호출한 곳)으로 throws 던지겠다
    // throw 와 throws 의 차이에 주의
    // throw 는 시점에 터트리는것,
    // throws 는 밖으로 던지는것
    public void call() throws MyCheckedException{ // 여기를 호출 한 서비스에게 예외를 던짐

        // 문제 상황 발생(throw) _ 예시 (예외 또한 객체이므로 생성 후 발생시켜야 한다)
        throw new MyCheckedException("excep");

    }
}
