package enumeration.test.ex1;

public enum Menu {
    // 0. Enum 변수 설정
//    GUEST(AuthGrade.GUEST, new String[]{"메인 화면"})
//    , LOGIN(AuthGrade.LOGIN, new String[]{"메인 화면", "이메일 관리 화면"})
//    , ADMIN(AuthGrade.ADMIN, new String[]{"메인 화면", "이메일 관리 화면", "관리자 화면"});

    GUEST(new String[]{"메인 화면"})
    , LOGIN(new String[]{"메인 화면", "이메일 관리 화면"})
    , ADMIN(new String[]{"메인 화면", "이메일 관리 화면", "관리자 화면"});

    // 1. Enum 변수의 인스턴스 초기화 값을 보관하는 **불변** 멤버변수 설정
    // private final AuthGrade authGrade;
    private final String[] menuList;

    // 2. Enum 타입을 생성할 수 있도록 생성자 설정
    // Menu(AuthGrade authGrade, String[] menuList) {
    //     this.authGrade = authGrade;
    //     this.menuList = menuList;
    // }

     Menu(String[] menuList) {
         this.menuList = menuList;
     }

    // 3. Enum 타입의 불변 변수를 조회할 수 있는 메서드 설정
    public String[] getMenuList() {
        return menuList;
    }

//    public AuthGrade getAuthGrade() {
//        return authGrade;
//    }
}
