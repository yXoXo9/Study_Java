package oop_1;

public class MusicPlayerMain_ForOOP {
    public static void main(String[] args){
        MusicPlayer_ForOOP mPlayer = new MusicPlayer_ForOOP();
        //음악 플레이어 켜기
        mPlayer.on();
        //볼륨 증가
        mPlayer.volumeUp();
        //볼륨 증가
        mPlayer.volumeUp();
        //볼륨 감소
        mPlayer.volumeDown();
        //음악 플레이어 상태
        mPlayer.showStatus();
        //음악 플레이어 끄기
        mPlayer.off();

        /*
        * 캡슐화.
        * 클래스(기준정보, 개념)의 속성과 기능(행위 및 동작을 메서드로)을 묶어서
        * 하나의 객체, 인스턴스로 만드는 것을 캡슐화라고 한다. (더 많은 캡슐화 형태 중 하나...)
        *
        * 객체 지향 프로그래밍 덕분에 음악 플레이어 객체를 사용하는(개발하는) 입장에서
        * 1. 코드(내부)를 몰라도 사용 및 메서드를 통해 어떤 동작을 하는지 알 수 있고, (캡슐화)
        * 2. 인스턴스를 사용한 Main 로직들에 대해서 조회, 수정, 추적, 파악 등의 비용을
        * 단 하나의 객체 안으로 응집할 수 있다. (캡슐화)
        * 3. 또 다른 장점은 필드 이름이 바뀐 경우 다른 로직을 전혀 수정하지 않아도 된다. (캡슐화)
        * 4. Logger 나 단위테스트 등, 기능에 대한 점검, 수정 시간 투자 부분도
        * 한 곳으로 파악 범위가 명확해지니 시간이 줄어듦.
        * */
    }
}
