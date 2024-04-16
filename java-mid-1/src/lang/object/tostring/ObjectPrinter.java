package lang.object.tostring;

public class ObjectPrinter {
    public static void print(Object obj){
        String st = "객체 정보 출력: " + obj.toString();
        // String st2 = "객체 정보 출력: " + obj; // 동일함,
        //              string 상수 값에 의해 toString 변환
        System.out.println(st);
    }
}
