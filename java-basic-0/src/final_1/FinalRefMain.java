package final_1;

public class FinalRefMain {

    static public class DataX {
        public int value;
    }

    public static void main(String[] args) {
        final DataX dataX;
        dataX = new DataX();
        // data = new Data(); // final 에러


        final Data data; // 참조형
        data = new Data();
        // data = new Data(); // final 에러

        final Data data2 = new Data();
        // data2 = new Data(); 에러 발생

        /*
        하지만 참조형 인스턴스 내부 값은 바꿀 수 있다.
        참조값만 바꿀 수 없을뿐
        final Data data2 = new Data(); 여기서 참조값만 고정됨
        */
        data2.value = 10;
        System.out.println(data2.value);
        data2.value = 20;
        System.out.println(data2.value);

        
    }
}
