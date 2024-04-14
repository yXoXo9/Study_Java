package class2_ref;

public class InitMain {
    public static void main(String[] args){
        InitData chkData = new InitData();

        /*
        * 멤버변수,
        * 기본형은 자동으로 초기화되며
        * 참조형은 NULL 로 초기화 된다. (참조할 대상이 없으므로, 다시말해 참조값이 없음)
        *
        * 지역변수,
        * 항상 수동으로 초기화해야 한다.
        * 미 수행시, 어떤 값이 들어있는지 모르기 때문에 정상적인 수행을 할 수 없다.
        * InitData chkData;
        * */
        System.out.println("// int 멤버변수 초기화 X //");
        System.out.println("chkData.value1 = " + chkData.value1 + "\n");
        System.out.println("// int 멤버변수 초기화 10 //");
        System.out.println("chkData.value2 = " + chkData.value2);
    }
}
