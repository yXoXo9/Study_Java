package poly.car0;

public class Driver {

    /* Driver 클래스를 생성하면,
    운전자는 있지만,
    K3car 에 대해선 (Null) 갖고 있지 않는 상태,
    set 을 통해 K3car 를 넣어줘야 한다
     */
    // 인스턴스 변수다,
    // 왜? Driver 가 호출, 인스턴스 생성 시 K3Car 클래스의 k3Car 인스턴스가 생성되기 때문,
    // 즉, 기본형 멤버 변수와는 다름
    private K3Car k3Car;
    private Model3Car model3Car;

    /*
    * 위에 보이는 드라이버 클래스는,
    * K3Car 와
    * Model3Car 에 의존하고 있다.는 의미
    * 의존 => 해당 클래스를 알고 있다.
    * 그러면, 멤버 클래스가 아닌
    * 인터페이스를 알게 되면
    * 해당 인터페이스를 알고 있다로 바뀔 수 있다.
    *
    * */

    public void setK3Car(K3Car k3Car){
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    // 운전자가 드라이브(운전)를 하면 ~메서드 바디~ 하겠다......... 정의
    public void drive(){
        System.out.println("자동차를 운전합니다.");
        // 구현(실체가)이 늘어날 때마다 코드가 계속 증가 됨
        if(k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngin();
        }else if(model3Car != null){
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngin();
        }
    }

}
