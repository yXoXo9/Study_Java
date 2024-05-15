package nested.inner.diy1;

public class CarMain_3 {
    public static void main(String[] args) {
        Car_1 modelY = new Car_1("Model_C", 1000);
        modelY.start();
        System.out.println();
        Car_1 modelK = new Car_1("Model_K", 100);
        modelK.start();
    }
}
