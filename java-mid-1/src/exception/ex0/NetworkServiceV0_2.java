package exception.ex0;

public class NetworkServiceV0_2 {
    public void sendMessage(String data){
        String accessAddress = "http://example.com";
        NetworkClientV0_1 client = new NetworkClientV0_1(accessAddress);

        // 메시지 연결하기 위해서는 서버 연결 먼저.
        client.connect();

        // 메시지 전송
        client.send(data);

        // 네트워크 연결 해제
        client.disconnect();

    }
}
