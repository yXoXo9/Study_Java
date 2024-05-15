package nested.inner.diy1;

public class Car_1 {
    private String model;
    private int chargeLevel;
    private Engine_2 engine;

    public Car_1(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine_2();
    }

    private class Engine_2 {
        public void start(){
            System.out.println("충전 레벨 확인: " + chargeLevel + " // By_EnginClass");
            System.out.println(model + "의 엔진을 구동합니다. // By_EnginClass");
        }
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료 // By_CarClass");
    }
}
