package enumeration.test.ex1;

public enum AuthGrade {
    // 0. Enum 변수 설정
    GUEST(1, "손님")
    , LOGIN(2, "로그인 회원")
    , ADMIN(3, "관리자")
    ;

    // 1. Enum 변수의 인스턴스 초기화 값을 보관하는 **불변** 멤버변수 설정
    private final int level;
    private final String description;

    // 2. Enum 타입을 생성할 수 있도록 생성자 설정
    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    // 3. Enum 타입의 불변 멤버변수를 조회할 수 있는 메서드 설정
    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public static void showGrade(String str) {
        System.out.println("당신의 등급은 " + AuthGrade.valueOf(str.toUpperCase()).description + "입니다.");
    }

    public static void showMenuByGrade(String str) {
        String[] menuList = Menu.valueOf(AuthGrade.valueOf(str).name()).getMenuList();
        for (String s : menuList) {
            System.out.println("- " + s);
        }
        // System.out.println("==메뉴 목록==");
        // System.out.println("당신의 등급은 " + AuthGrade.valueOf(str).description + "입니다.");
    }

    // 문제 - 2
    // 3-1. Enum 타입의 불변 멤버변수를 조회할 수 있는 메서드 설정
    public static void getEnumInfo(AuthGrade authGrade) {
        System.out.println(
                authGrade.name() + " 의 "
                    + "level : " + authGrade.level
                        + " description : " + authGrade.description);
    }
}
