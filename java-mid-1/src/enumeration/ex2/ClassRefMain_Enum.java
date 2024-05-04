package enumeration.ex2;

public class ClassRefMain_Enum {
    public static void main(String[] args) {
        /*
        * 셋 다 동일한 타입의 ClassGradeEnum 클래스로 만들어짐,
        * */
        extracted();
        System.out.println();

        /*
        * 하지만, 바라보는 참조값은 서로 다르다.
        * (각각 인스턴스를 생성했기 때문)
        *
        * ClassGradeEnum (BASIC, GOLD, DIAMOND) 를 열거형으로 나열했다.
        * */
        extracted1();
        System.out.println();
    }

    private static void extracted1() {
        System.out.println("ref BASIC = " + classGradeEnum.BASIC);
        System.out.println("ref GOLD = " + classGradeEnum.GOLD);
        System.out.println("ref DIAMOND = " + classGradeEnum.DIAMOND);
        /*
        ref BASIC = enumeration.ex2.ClassGradeEnum@1d81eb93
        ref GOLD = enumeration.ex2.ClassGradeEnum@7291c18f
        ref DIAMOND = enumeration.ex2.ClassGradeEnum@34a245ab
        */
    }

    private static void extracted() {
        System.out.println("Class BASIC = " + classGradeEnum.BASIC.getClass());
        System.out.println("Class GOLD = " + classGradeEnum.GOLD.getClass());
        System.out.println("Class DIAMOND = " + classGradeEnum.DIAMOND.getClass());
        /*
        * Class BASIC = class enumeration.ex2.ClassGradeEnum
        * Class GOLD = class enumeration.ex2.ClassGradeEnum
        * Class DIAMOND = class enumeration.ex2.ClassGradeEnum
        * */
    }
}
