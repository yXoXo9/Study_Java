package other_forJava;

public class java21Switch {
    public static void main(String[] args) {
        int gd = 2;
        int cp = switch (gd){
            case 1 -> 10;
            case 2 -> 20;
            case 3 -> 30;
            default -> 50;
        };
        System.out.println("발급받은 쿠폰 = " + cp);
    }
}
