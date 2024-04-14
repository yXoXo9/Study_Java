package static_2_forMethod.ex;

public class MathArrayUtils {
    /*
    * 기능만 존재하는 유틸리티 클래스를 인스턴스화 시키는 것은 메모리 낭비다.
    * */
    private MathArrayUtils(){
        /* 인스턴스 생성을 막는다. */
    }

    public static int sum(int[] values) {
        int sum = 0;
        for (int i : values){
            sum += i;
        }
        return sum;
    }

    public static double average(int[] values) {
        /*int sum = 0;
        for (int i : values){
            sum += i;
        }
        return (double) sum/values.length;*/

        /* 이미 만든 Sum을 사용하면 된다. (항상 재사용성을 생각하자.)*/
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int value : values) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = 0;
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
