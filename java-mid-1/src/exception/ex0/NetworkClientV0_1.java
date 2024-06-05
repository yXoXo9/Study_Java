package exception.ex0;

public class NetworkClientV0_1 {

    private final String address; // 접근하려는 외부 서버 주소.. 예시
    private String resultMsg = "Success";

    public NetworkClientV0_1(String address) {
        this.address = address;
    }

    // 연결 메서드
    public String connect(){
        // 연결 시 메시지 출력
        System.out.println("서버 연결 성공 : " + address);
        return resultMsg;
    }

    public String send(String data){
        // 전송 시 메시지 출력
        System.out.println("서버에 데이터 전송 : " + address + " // 데이터 : " + data);
        
        return resultMsg;
    }

    public void disconnect(){
        System.out.println("연결 해제 : " + address);
    }
}
