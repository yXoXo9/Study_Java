package lang.string.immutable;

public class StringImmutable_1 {
    public static void main(String[] args) {
        String str_1 = "hello";
        // String t = str_1.concat(" Java"); 불변 객체 리턴받아서 사용..
        System.out.println("str_1 = " + str_1);

        String str_2 = "hello";
        String rtnImmutableStr = str_1.concat(" Java");
        System.out.println("rtnImmutableStr = " + rtnImmutableStr);
    }
}
