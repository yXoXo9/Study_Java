package oop_1;

public class MusicPlayer_ForOOP {
    /* 클래스(기준정보, 개념)의 멤버변수, 필드 정의*/
    int volumn = 0;
    boolean isOn = false;

    /* 캡슐화
    * 속성과 기능을 하나로 묶어서 필요한 기능을 외부에 제공하는 것
    * 사용자는 그 안의 내용을 몰라도 쓸 수 있음.
    *  */

    /* 기준정보, 개념의 기능(행위 및 동작) 정의 */
    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp(){
        volumn++;
        System.out.println("음악 플레이어 볼륨:" + volumn);
    }

    void volumeDown(){
        volumn--;
        System.out.println("음악 플레이어 볼륨:" + volumn);
    }

    void showStatus(){
        System.out.println("음악 플레이어의 상태는 "+ isOn +", 입니다. 볼륨: "+ volumn);
    }
}
