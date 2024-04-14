package access_6;

public class SpeakerMain {
    public static void main(String[] args){
//        Speaker sp = new Speaker(90);
//        Speaker sp = new Speaker(200);
        Speaker sp = new Speaker(90);
        sp.showVolume();

        sp.volumeUp(); // 초기 100 이상을 막는 것이 중요
        sp.showVolume();

        sp.volumeUp();
        sp.showVolume();

        // 개발 내용(핵심사항 및 제한사항)을 모르는 제3자 개발자가 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 후 수정");
//        sp.volume = 200; // 초기 제한 사항을 벗어난 행위
        sp.showVolume();

        /*
        * 100을 넘지 못하게 기능을 개발 했지만 (요구사항)
        * 제 3자가 필드를 직접 접근해서 수정해버림 (기능에 대한 제약 사항을 벗어난 행위)
        * => Speaker 객체를 사용하는 사용자는 volume 필드와 메서드에 모두 접근할 수 있다.
        *
        * ==> 이러한 상황을 컨트롤하기 위해 사용하는 것이 '접근 제어자' (Access Modifier)
        * */


        /*
        * 근본적 해결 방법은 volume 필드를 클래스 외부에서 접근하지 못하게 막는것.
        * => 그러면 방법은 1. 초기화 값을 통해서 수정, 2. volumeUp 메서드를 사용
        * 그 중 2번은 제한할 수 있음.
        *
        * private 설정
        * ! 해당 클래스 내부에서만 호출할 수 있다. !
        *
        * sp.volume = 200; // 초기 제한 사항을 벗어난 행위 => 접근할 수 없음
        * ===>
        * 현재 클래스 구조 상
        * 개발자가 정의한 메소드를 통해서만 volume 필드를 접근하고, 사용할 수 있음
        *
        * 접근 제어자를 통해 컨트롤한 필드를 외부가 아니라 클래스 내부에서만 통제하고 관리할 수 있다.
        *
        * 좋은 프로그램.
        * 무한한 자유도가 주어지는 프로그램이 아니라 적절한 제약을 제공하는 프로그램이다.
        *
        * Access Modifier 종류
        * 1. private : 외부 호출을 모두 제한
        * 2. default(= package-private): 같은 패키지(Directory) 안에서 호출은 허용한다.
        * (Access Modifier 를 아무것도 선언하지 않은 상태)
        *
        * 3. protected: 같은 패키지안에서 호출은 허용한다,
        * + 패키지가 달라도 상속 관계의 호출은 허용한다.
        *
        * 4. public : 모든 외부 호출을 허용한다.
        *
        * private(다막기)
        *  default(패키지안) -> protected (패키지+상속 관계의 패키지까지)
        * public(모두허용)
        *
        * Access Modifier의 핵심은 속성과 기능을 외부로 숨기는 것이다.
        *
        * 접근 제어자는
        * 필드, 메서드, 생성자에 주로 사용되며
        * 추가적으로 클래스 레벨에도 '일부' 접근 제어자를 사용할 수 있다
        *
        * 지역변수(애초에 지역 스코프 안에서만 사용하기 때문에 의미가 없음, 사용 불가)
        * 
        * */
    }
}
