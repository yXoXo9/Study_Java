package exception.basic.checked;

public class ExceptionClient_2 {

    // throw 로 소화(발생한 곳에서 해결하지 않고)하지 않고(하기 메서드를 호출한 곳)으로 throws 던지겠다
    // throw 와 throws 의 차이에 주의
    // 1. throw 는 시점에 에러를 (던지는)터트리는것,
    // 2. throws 는 밖으로 던지는것

    public void call() throws MyCheckedException{

        // 클래스를 호출한 곳(서비스)으로 예외를 던짐 (throws)
        // 문제 상황 발생(throw) _ 예시 (예외 또한 객체이므로 생성 후 발생시켜야 한다)
        throw new MyCheckedException("exception");
    }
}
