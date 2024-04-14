package static_2_forMethod;

import static_1.Data3;

/* 정적 메서드를 그대로 사용하겠다고 선언(클래스명 생략 가능, 왜? 어디 클래스에 있는건지 명시해주기 때문) */
//import static static_2_forMethod.DecoData.staticCall; // 메서드 지정
//import static static_2_forMethod.DecoData.*; // DecoData 내부 전체 static 사용

public class DecoDataMain_1 {

    /* 인스턴스없이 실행하는 가장 대표적인 메서드가 main()
    *
    * 정적 메서드 내부, 같은 클래스 내부에서 정적 메서드만 호출할 수 있다.
    * static 내부에서 인스턴스 메서드를 호출하기 위해선 인스턴스 생성 후 참조 값을 통해서만 가능하다.
    *  */
    void chk(){
        System.out.println("this.Chk");
    }

    public static void main(String[] args) {
        System.out.println("1. 정적 호출_1");
        DecoData.staticCall();
//        DecoData.staticCall();
//        DecoData.staticCall();
//        DecoData.staticCall();
//        DecoData.staticCall();

        /* static 내부에서 인스턴스 메서드를 호출하기 위해선 인스턴스 생성 후 참조 값을 통해서만 가능하다. */
        DecoDataMain_1 me = new DecoDataMain_1();
        me.chk();

        /* 여러번 호출 할때마다 클래스명 적어주는것... */

        System.out.println();

        System.out.println("2. 인스턴스 호출 _1");
        DecoData deco = new DecoData();
        deco.instanceCall();
        System.out.println();

        System.out.println("3. 인스턴스 호출 _2");
        DecoData deco2 = new DecoData();
        deco2.instanceCall();

        System.out.println();

        // +alpha
        // 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        //인스턴스를 통한 접근 ==> IntelliJ 에서도 권장하지 않는 방식이므로 경고출력
        System.out.println("인스턴스에서 접근 = " + data4.count);

        // 인스턴스를 통한 접근
        Data3 data5 = new Data3("E");
        //인스턴스를 통한 접근
        System.out.println("인스턴스에서 접근 = " + data5.count);
        /* 클래스 변수라는걸 직관적으로 확인할 수 있다. */
//        System.out.println("클래스에서 접근 = " + Data3.count);
//        System.out.println("클래스에서 접근 = " + Data3.count);


        // => 찾아가는 변수가 정적(Static)으로 되어 있는 경우, 메서드 영역 내 static 영역을 찾아가서 확인함.
        /*
        static 변수를 인스턴스를 통해 접근하는 것을 권장하지 않음.
        data4.count는 인스턴스의 변수인가.........? 인스턴스 변수

        Data3.count => 클래스 변수네 (정적 변수네) 바로 이해할 수 있음.

        ****** 관점을 두개로 나눠라
        만드는 입장과 가져다 쓰는 입장을 생각해야하는데

        !!!! 가져다 쓰는 입장을 굉장히 중요하게 여겨야 한다. !!!

        */

        //클래스 접근
        System.out.println("클래스에서 접근 = " + Data3.count);

        // 추가
        // 인스턴스를 통한 접근
        DecoData decoData = new DecoData();
        decoData.staticCall();
        // intellij에서 추천하지 않으므로 힌트가 제공되지 않음

        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}
