package static_1;

public class Data3 {
    public String name;
    public static int count; //static 변수, 정적 변수, +클래스 변수

    public Data3(String name){
        this.name = name;
        count++;
//        Data3.count++; // 자신의 정적 변수, 클래스 변수, static 변수, count 값을 증가하는 것이기 때문에, 생략가능.

    }

    /* Data1....
    * public String name;
    public int count;

    public Data1(String name){
        this.name = name;
        count++;
    }
    * */
}
