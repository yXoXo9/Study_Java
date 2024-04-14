package class2_ref;

public class NullMain3_Bybig {
    public static void main(String[] args){
        BigData bigData = new BigData();

        /* 멤버변수는 초기값 자동으로 입력 됨 */
        System.out.println("bigData.count = " + bigData.count); // 0
        System.out.println("bigData.data = " + bigData.data); // null

        /* NPE !!*/
//      x001.null.value
//      System.out.println("bigData.data.value = " + bigData.data.value);

//      참조값을 넣어주면 해결
        bigData.data = new Data();
//      x001.null = x002;
        System.out.println("x001.x002 = " + bigData.data);
        System.out.println("x001.x002.value = " + bigData.data.value);
//      System.out.println("bigData.data.value = " + x001.null.value);

    }
}
