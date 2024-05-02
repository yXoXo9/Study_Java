package lang.math.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*
 * 로또 번호를 자동으로 만들어주는 생성기
 * 1~45 사이의 숫자 6개를 뽑아야 한다.
 * 각 숫자는 중복되면 안된다.
 * 실행할 때 마다 결과가 달라야 한다.
 * */
public class LottoGenerator {

    public String getNumber() {
        /*
        * 1 ~ 45 숫자를 생성하는 부분을 분리할 생각...
        * */
        Random random = new Random();
        int[] arrLottoNumber = new int[6];
        int count = 0;

        while (count < 6){
            int i = random.nextInt(45) + 1;

            /*
            * 검증하는 부분을 분리할 생각...
            * */
            if (arrLottoNumber.toString().indexOf(i) == -1) {
                arrLottoNumber[count++] = i;
            }
        }

        return Arrays.toString(arrLottoNumber);
        // System.out.println("로또 번호 = " + Arrays.toString(arrLottoNumber));
    }
}
