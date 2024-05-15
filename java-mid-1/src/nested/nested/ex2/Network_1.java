package nested.nested.ex2;

// 무언가 '???'(보내는) 목적을 수행하기 위한 클래스
public class Network_1 {

    public void sendMessage(String text){
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    // Network 객체 안에서만 사용하려는 목적
    private static class NetworkMessage {
        private String content;

        // 해당 클래스를 생성 시 메시지를 집어 넣으려는 목적
        public NetworkMessage(String content) {
            this.content = content;
        }

        // 이 클래스의 기능은 등록한 메시지를 출력하는 용도
        public void print(){
            System.out.println(content);
        }
    }
}
