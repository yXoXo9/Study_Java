package enumeration.test.ex1;

public class AuthGradeMain_1 {
    public static void main(String[] args) {

        // AuthGrade.getInstance(AuthGrade.GUEST);

        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade authGrade : values) {
            AuthGrade.getEnumInfo(authGrade);
        }
    }
    /*GUEST(1, "손님");

    private int level;
    private String description;

    AuthGradeMain_1(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public static void getInstance(AuthGradeMain_1 authGrade) {
        System.out.println(
                authGrade.name() + "의 (level, description) : ("
                        + authGrade.level + ", " + authGrade.description + ")");
    }*/
}
