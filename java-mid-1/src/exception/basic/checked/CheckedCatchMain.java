package exception.basic.checked;

public class CheckedCatchMain {
    public static void main(String[] args) {
        ExceptionService exceptionService = new ExceptionService();
        exceptionService.callCatch();
        System.out.println("정상종료...");
    }
}
