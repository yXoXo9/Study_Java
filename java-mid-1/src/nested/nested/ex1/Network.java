package nested.nested.ex1;

// 무언가 '???'(보내는) 목적을 수행하기 위한 클래스
public class Network {

    public void sendMessage(String text){
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
}
