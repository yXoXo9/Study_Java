package exception.ex1;

public class NetworkClientV1_0 {

    /* 테스트용 */
    public boolean connectError;
    public boolean sendError;

    private final String address; // 접근하려는 외부 서버 주소.. 예시
    private String resultMsg = "Success";

    public NetworkClientV1_0(String address) {
        this.address = address;
    }

    // 연결 메서드
    public String connect(){
        if(connectError){
            System.out.println("연결 실패 = " + address);
            return "connectError";
        }
        // 연결 시 메시지 출력
        System.out.println("서버 연결 성공 = " + address);

        return resultMsg;
    }

    public String send(String data){
        if(sendError){
            System.out.println("데이터 전송 실패 = " + address);
            return "sendError";
        }
        // 전송 시 메시지 출력
        System.out.println("서버에 데이터 전송 = " + address + " // 데이터 : " + data);
        
        return resultMsg;
    }

    public void disconnect(){
        System.out.println("연결 해제 = " + address);
    }

    public void initError(String data){
        if(data.contains("er1")){
            connectError = true; //연결 에러 발생
        }
        if(data.contains("er2")){
            sendError = true; //전송 에러 발생
        }
    }
}
