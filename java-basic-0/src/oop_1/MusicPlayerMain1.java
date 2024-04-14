package oop_1;

public class MusicPlayerMain1 {
    public static void main(String[] args){
/*      int volumn = 0;
        boolean isOn = false;

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        //볼륨 증가
        volumn++;
        System.out.println("음악 플레이어 볼륨:" + volumn);
        //볼륨 증가
        volumn++;
        System.out.println("음악 플레이어 볼륨:" + volumn);
        //볼륨 감소
        volumn--;
        System.out.println("음악 플레이어 볼륨:" + volumn);
        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        System.out.println(isOn ? "음악 플레이어 On, 볼륨 : " + volumn : "음악 플레이어 OFF");
        //음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다. ");

        // 1. 절차, 순서대로 프로그래밍

*/
        /*
        2. 기준 정보(개념)를 기준으로 데이터를 묶음
        Class 로 묶을 수 있지 않을까? 왜 ? = 설계도, 음악플레이어라는 설계도를 생각
        "음악 플레이어" 기능 중 1.볼륨을 조절하고 2.스위치를 동작하게 정의하면 되지 않을까
        "MusicPlayerData" 의 멤버변수 1.int volumn, 2. boolean isOn;
            => 음악 플레이어와 관련된 정보를 만들기 위해, 지역변수를 클래스에 묶어서 관리
        */

/*
        MusicPlayerData mData = new MusicPlayerData();
        // 음악 플레이어 켜기
        mData.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
        //볼륨 증가
        mData.volumn++;
        System.out.println("음악 플레이어 볼륨:" + mData.volumn);
        //볼륨 증가
        mData.volumn++;
        System.out.println("음악 플레이어 볼륨:" + mData.volumn);
        //볼륨 감소
        mData.volumn--;
        System.out.println("음악 플레이어 볼륨:" + mData.volumn);
        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        System.out.println(mData.isOn ? "음악 플레이어 On, 볼륨 : " + mData.volumn : "음악 플레이어 OFF");
        //음악 플레이어 끄기
        mData.isOn = false;
        System.out.println("음악 플레이어를 종료합니다. ");
*/
        /*
        3. 기준 정보(개념)를 표현하는 값을 클래스에 묶고난 후,
        메서드 추출 (동작을 정의)
        ex) 음악 플레이어 =>
        1. 플레이어 On, Off
        2. 볼륨 증가, 감소
        3. sout... 음악 플레이어 상태 까지
        */

        /*
        *
        * 클래스를 정의하고 메소드를 정의할 경우 얻을 수 있는 효과
        * => 동작(행위)를 메서드로 분리함으로 인해 얻을 수 있는 장점,
        *
        * 각 기능(행위)별 메서드(기능 및 행위에 대해)이름을 통해
        * '사람이' 코드를 더 쉽게 이해할 수 있도록 할 수 있다.
        * 또한, 메소드(기능 및 행위)별 테스트 수행 가능함으로서
        *
        * 메서드가 사용된 변경 영향 범위가 명확해짐
        * 다시말해, 기능 수정 시 해당 메서드 내부만 변경하면 됨
        *
        * 단순하게는 라인 수 단축과 각 기능(행위)이 명확해짐으로 (스코프의 단축) 유지보수성이 향상됨
        *
        * 2. 기존 중복 로직의 제거
        * 3. 메서드(기능 및 행위에 대해)이름을 통해 '사람이' 코드를 더 쉽게 이해할 수 있도록 할 수 있다.
        * */

        MusicPlayerData mData = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(mData);
        //볼륨 증가
        volumeUp(mData);
        //볼륨 증가
        volumeUp(mData);
        //볼륨 감소
        volumeDown(mData);
        //음악 플레이어 상태
        showStatus(mData);
        //음악 플레이어 끄기
        off(mData);


        /* 주석을 제거하더라도 클래스명과 메소드만 보고 동작을 알 수 있나?
        => 사람이 이해하기 쉬운 코드로 발전하는 길..
        */

        /*
        * 핵심은 "모듈화"
        * 클래스(기준정보, 개념)에 필요한 블럭(메서드)를
        * 조립, 결합하여 프로그램을 작성한다.
        *
        * 클래스(기준정보, 개념)로 데이터를 묶고, 클래스의 기능(행위 및 동작)을 메서드로 나눈다.

        * !! But, 여기까지도 절차 지향 프로그래밍이다. !!
        * 왜 ? "음악 플레이어"라는 클래스(기준정보, 개념)와 기능
        * ''인스턴스의 행위 및 동작''이 서로 분리되어 있다. = 각 메서드를 사용해야 함..
        * ======> 절차 지향 프로그래밍의 한계, => (기준정보, 개념의) ''절차, 순서''대로 프로그래밍
        * 관리 포인트가 2곳이 되버림 => 클래스(기준정보, 개념)와 메서드(기능, 행위)
        * */
    }
    // endMain

    static void on(MusicPlayerData paramMpd){
        paramMpd.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    static void off(MusicPlayerData paramMpd){
        paramMpd.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData paramMpd){
        paramMpd.volumn++;
        System.out.println("음악 플레이어 볼륨:" + paramMpd.volumn);
    }

    static void volumeDown(MusicPlayerData paramMpd){
        paramMpd.volumn--;
        System.out.println("음악 플레이어 볼륨:" + paramMpd.volumn);
    }

    static void showStatus(MusicPlayerData paramMpd){
        System.out.println("음악 플레이어의 상태는 "+ paramMpd.isOn +", 입니다. 볼륨: "+ paramMpd.volumn);
    }


}
