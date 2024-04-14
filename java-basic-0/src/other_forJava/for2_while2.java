package other_forJava;

import java.util.Arrays;

public class for2_while2 {
    public static void main(String[] args) {
        System.out.println("do_While");
        int sum = 0;
        int i = 1;
        int endNum = 3;
        while (i <= endNum){
            sum = sum + i;
            System.out.println("i=" + i + " sum = " + sum);
            i++;
        }
    /*
      ! while 과 for의 결과는 동일하지만 !

      스코프 관점, 메모리 효율과 유지보수 관점을 따져보자.

      while = 변수 i의 스코프는 main의 전체로 됨
      for = 변수 fi의 스코프는 for문 안으로 한정 됨

      => 반복문을 위한 loop count 변수는 while 보다 for문을 사용하는 것이 좋음

      왜?
      변수의 스코프 범위를 제한함으로서,
      1. 사용 종료된 변수를 메모리에 적재하지 않고 // 효율적인 메모리 - 자원 측면
      2. 레거시 소스 파악 시 변수를 사용한 범위가 명확해지므로 // 코드 복잡성을 낮출 수 있다. - 유지보수 측면

      두 가지 다 스코프의 개념을 생각하면서 변수를 사용하면 얻을 수 있는 장점

    = 정리 => 변수는 사용 범위를 정하고 사용해야 한다.
    왜? 메모리(자원)를 낭비하지 않고, 유지보수하기 좋은 코드로 만들 수 있기 때문이다.
    --------------------------------------------------------------------------------
    !!!! 이전에 내가 생각하던 습관...
        무한한 자유는 무한한 버그를 낳을 수 있다
        프로그램의 적절한 제약을 통해서
            1. 프로그램에서 고려해야 할 대상이 명확해지고,
        스코프 관점만 생각해봤을 때
            2. 스코프의 개념을 통해 메모리 낭비를 방지, 유지보수의 난이도 하락 등 이득이 많다

        그 밖의 지금 알지 못하는 범위의 취할 수 있는 많은 이득이 존재한다.
    !!!!
        좋은 프로그램은, 적절한 제약을 통해 만들어진다.
    */
        System.out.println("-------");
        System.out.println("do_For");
        int fSum = 0;
        int fEndNum = 3;
        for (int fi=1; fi<= fEndNum; fi++){
            fSum = fSum + fi;
            System.out.println("fi=" + fi + " fSum=" + fSum);
        }

        // soutv Variable value 출력
        // soutp method parameter name & values 출력
        // soutm current class & method name 출력
        System.out.println("fEndNum = " + fEndNum);
    }
}
