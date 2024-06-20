package exception.ex1;

public class NetworkServiceV1_4 {
    public void sendMessage(String data){
        String accessAddress = "http://example.com";
        NetworkClientV1_0 client = new NetworkClientV1_0(accessAddress);

        client.initError(data);
        String connectResult = client.connect();

        if(isError(connectResult)){
            System.out.println("네트워크 오류 발생 코드 : " + connectResult);
            return;
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("네트워크 전송 발생 코드 : " + sendResult);
                return;
            }
        }
        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("Success");
    }
}
