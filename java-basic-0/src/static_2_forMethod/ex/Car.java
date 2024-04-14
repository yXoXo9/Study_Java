package static_2_forMethod.ex;

public class Car {
//    private static String[] cars;
    private static int count;
    /* ---------------------- */
    private static int totalCars; // static 용 변수
    private String name; // 인스턴스 용 변수

    Car(String name){
        System.out.println("차량 구입, 이름 : " + name);
        count++;

        /* ---------------------- */
        this.name = name;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + count);
    }

//    public static void showTotalCars(){
////        for (String s : cars){
////            System.out.println("차량 구입, 이름: " + s);
////        }
//        System.out.println("구매한 차량 수: " + count);
//    }
}
