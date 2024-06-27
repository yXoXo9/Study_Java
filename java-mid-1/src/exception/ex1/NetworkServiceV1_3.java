package exception.ex1;

public class NetworkServiceV1_3 {
    public void sendMessage(String data){
        String accessAddress = "http://example.com";
        NetworkClientV1_0 client = new NetworkClientV1_0(accessAddress);

        client.initError(data);

        // 메시지 연결하기 위해서는 서버 연결 먼저.
        String connectResult = client.connect();

        // 결과가 성공이 아니다 => 오류다.
        // => 조건을 사람이 이해하기 더 쉽게 리팩토링

        if(isError(connectResult)){
            System.out.println("네트워크 오류 시 발생 코드 : " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if (isError(sendResult)){
            System.out.println("네트워크 전송 시 발생 코드 : " + sendResult);
            return;
        }
        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("Success");
    }
}
