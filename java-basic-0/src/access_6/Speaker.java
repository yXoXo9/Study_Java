package access_6;

public class Speaker {
    private int volume;

    // 생성자를 통한 초기 음량 값 저장
    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("음량을 증가할 수 없습니다. (최대 : 100)");
        }else{
            int volumeValue = 10;
            volume += volumeValue;
            System.out.println("음량을 " + volumeValue + " 증가합니다.");
        }
    }

    void volumeDown() {
        int volumeValue = 10;
        volume -= volumeValue;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }
}
