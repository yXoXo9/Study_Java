package class2_ref;

public class MethodChg1 {
    public static void main(String[] args){
        /* doPrimitive - - - */
        int a = 10;
        System.out.println("메서드 호출 전 = " + a);
        chgPrimitive(a); // 상수 값 10을 대입
        System.out.println("메서드 호출 후 = " + a);

        /* doReference - - - */
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("dataA 참조값 = " + dataA);
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value);
        chgReference(dataA); // dataA의 참조값을 전달.
        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value);

    }

    public static void chgPrimitive(int paramX){ // 메소드 호출 시 int paramX 메모리 공간 생성 Constants Pool
        paramX = 20;
    }

    public static void chgReference(Data paramData) {
        System.out.println("paramData 참조값 = " + paramData);
        paramData.value = 20;
    }
}
