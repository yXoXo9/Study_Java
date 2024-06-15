package enumeration.ex3;

public enum Grade {
    /*
    * 열거형 정의 시 class 대신 enum 을 사용한다.
    * */
    // BASIC, GOLD, DIAMOND

    BASIC
    , GOLD
    , DIAMOND

    /*
    하기 코드와 동일한 기능을 수행 (enum 또한 클래스다)
    열거형은 자동으로 java.lang.Enum 을 상속받는다.
    외부에서 임의로 생성할 수 없다.

    public class Grade extends Enum {
        public static final Grade BASIC = new Grade();
        public static final Grade GOLD = new Grade();
        public static final Grade DIAMOND = new Grade();
        private Grade() {}
    }
    */
}
