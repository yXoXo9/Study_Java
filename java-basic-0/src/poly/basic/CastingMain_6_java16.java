package poly.basic;

public class CastingMain_6_java16 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent_1_호출");
        call(parent1);

        System.out.println("------");
        System.out.println("parent_2_호출");
        Parent parent2 = new Child();
        call(parent2);

        // 개발자 입장, 사용자 입장에서
    }

    // 하기 메서드를 만드는 개발자 입장에서 (어떤 Parent 타입의 인스턴스가 오는지 확인할 수 없음)

    /*
    * 하기 코드의 단점
    * instanceof를 주로 사용하는 이유는,
    * 다양한 클래스 타입의 변수가 확인하려는 인스턴스 타입이 맞으면,
    * 개발자가 다운 캐스팅 후 사용하려고 많이 사용함
    * */
    private static void call(Parent parent){
        System.out.println("In_Call");
        parent.parentMethod();

        // Child 인스턴스인 경우 childMethod() 실행
        // if (parent instanceof Child){ // java 16 이전
        // ((Child) parent).childMethod(); // 16 이전에서 사용
        if (parent instanceof Child certainChild){ /* 16이후 확인과 함께 변수 생성 및 선언 */
            System.out.println("Child 인스턴스 입니다.");
            certainChild.childMethod();  /* 16이후 */
        }else{
            System.out.println("Parent 인스턴스 입니다.");
        }

    }
}
