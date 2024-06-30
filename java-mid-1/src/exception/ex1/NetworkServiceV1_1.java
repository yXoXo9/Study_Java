package exception.ex1;

public class NetworkServiceV1_1 {
    public void sendMessage(String data){
        String accessAddress = "http://example.com";
        NetworkClientV1_0 client = new NetworkClientV1_0(accessAddress);
        // 에러 컨트롤
        client.initError(data);

        // 메시지 연결하기 위해서는 서버 연결 먼저.
        client.connect();

        // 메시지 전송
        client.send(data);

        // 네트워크 연결 해제
        client.disconnect();
    }
}
