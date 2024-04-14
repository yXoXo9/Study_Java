package static_1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 a = new Data3("A");
        System.out.println("a = " + Data3.count); // static count
        /* 클래스에 직접 접근하는 것과 같음 Data3.count*/

        Data3 data3 = new Data3("B");
        System.out.println("data3 = " + Data3.count);

        Data3 data31 = new Data3("C");
        System.out.println("Data3.count = " + Data3.count);


        /*
        * Static 변수는
        * 메서드 영역에서 관리한다.
        * 힙 영역은 객체의 참조대상이 없는경우 GC 대상.
        * 즉, Data3의 인스턴스는 힙 영역에 존재하지만,
        * static int count 는 (정적 변수)는 메서드 영역에서 관리한다.
        *
        *
        * */

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
        System.out.println("클래스에서 접근 = " + Data3.count);
        System.out.println("클래스에서 접근 = " + Data3.count);


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
    }
}
