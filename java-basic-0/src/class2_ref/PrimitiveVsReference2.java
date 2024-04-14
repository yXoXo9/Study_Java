package class2_ref;

public class PrimitiveVsReference2 {
    public static void main(String[] args){
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값 = " + dataA);
        System.out.println("dataA 참조값 = " + dataA.sValue);
        System.out.println("dataB 참조값 = " + dataB);
        /*
         ** 자바는 항상 변수의 값을 복사해서 대입한다. **

         참조값을 대입했기 때문에 두 개의 변수는 같은 참조값을 갖고 있다.
         !주의!, 변수에 들어있는 '참조값만 복사'해서 전달한다.
         dataA(Data의 인스턴스)를 전체를 복사하는 것이 아니다.
        */
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // b 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
    }
}
