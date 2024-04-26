package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        /*
        * Split(String regex)
        * join(CharSeq ...)
        * */
        String str = "Apple,Banana,Orange";

        // split()
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println("s = " + s);
        }

        String addStr = "";
        for (String st : split) {
            addStr += st + "-";
        }
        System.out.println("addStr = " + addStr);
        // join()

        // String joinStr = String.join("-", "A", "B", "C");
        String joinStr = String.join("-", split);
        System.out.println("joinStr = " + joinStr);
    }
}
