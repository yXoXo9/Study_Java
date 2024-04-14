package poly.basic;

public class CastingMain_5 {
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
    private static void call(Parent parent){
        System.out.println("In_Call");
        // 다운 캐스팅이 된 인스턴스가 올 수 있음.
        parent.parentMethod();

        // 확인하기 위해 instanceof keyword 사용
        // ===> ((call_1 = parent_new Parent(), call_2 = parent_new Child()) instanceof Child)
        if (parent instanceof Child){
            // 오른쪽에 있는 타입을 왼쪽에 있는 인스턴스 타입으로 대입할 수 있으면 True
            // => 오른쪽 대상의 자식 타입을 왼쪽에서 참조하는 경우 True

            /*
            * 오른쪽 타입을 왼쪽 다양한 타입 변수(어떤 타입이 올 줄 모르는)에 담을 수 있는 경우
            * */
            System.out.println("Child 인스턴스 입니다.");
            ((Child) parent).childMethod();
        }else{
            System.out.println("Parent 인스턴스 입니다.");
        }

    }
}
