package static_1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = "+ counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = "+ counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("c count = "+ counter.count);

        /*
        * Data2에 대한 내용인데 외부(Counter)의 도움을 받는건..... 뭔가 불편함
        * 객체1 + 객체Other
        * 의 모습으로 객체1을 위한 객체Other 가 사용되고 있음,
        * 객체1의 상태를 파악하는데 독립적이지 못한 구조,
        *
        * 객체1에 대한 인스턴스끼리의 공통 처리, 공용 변수를 만들 수 없을까?
        * Static 에 필요성
        * */
    }
}
