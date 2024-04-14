package final_1;

public class Constant {

    // 수학 상수
    public static final double PI = 3.14;

    // 시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;

    // 애플리케이션 설정 상수
    public static final int MAX_USERS = 1000;

    // 애플리케이션 전반에서 주로 사용하기 떄문에 Public 을 주로 사용한다.
    // 특정 위치에서도 사용할 수 있으면 접근 제어자를 통해 사용하면 됨
    // 중앙에서 값을 하나로 관리할 수 있다는 장점, (앱 설정 상수 등)
    // 런타임에 변경할 수 없다. 변경 시 프로그램을 종료하고, 코드를 변경한 후 서버를 다시 실행해야 한다.
    
}
