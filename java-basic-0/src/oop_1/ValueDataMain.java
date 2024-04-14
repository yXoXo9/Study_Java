package oop_1;

public class ValueDataMain {
    public static void main(String[] args){
        ValueData valueData = new ValueData();
        /* (1)
        add(valueData);
        add(valueData);
        add(valueData);
        */
        /* (2) 클래스(기준정보, 개념)와 기능(행위 및 동작)을 클래스에 정의하여 사용*/
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자 = " + valueData.value);
    }

    /* (1)
    ValueData (기준정보, 개념) 클래스에
     기능(행위 및 동작)을 정의하지 않은 경우
     => 절차 지향
     */
//    static void add(ValueData paramVd){
//        paramVd.value++;
//        System.out.println("숫자 증가 value = " + paramVd.value);
//    }

}
