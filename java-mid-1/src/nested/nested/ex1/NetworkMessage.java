package nested.nested.ex1;

// Network 객체 안에서만 사용하려는 목적
public class NetworkMessage {
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
