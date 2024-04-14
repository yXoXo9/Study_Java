package class1;

public class ClassStart2_solution_1 {
    public static void main(String[] args) {
        String sn1 = "1";
        int sa1 = 15;
        int sg1 = 90;
        String sn2 = "2";
        int sa2 = 16;
        int sg3 = 80;

//      System.out.println(sa1 + sg1 + sn1);

        /*
        단순 반복 => for, while loop...

        하지만, 지금 위에 변수명이 서로 다 다름
        어떻게 반복?
        같은 자료형으로 묶어서 배열로 사용해보자.
        */

//        String[] snStream = {};
//        int[] saStream = {};
//        int[] sgStream = {};
//        for(int i =0; i< snStream.length; i++){
//            System.out.println(snStream[i] + saStream[i] + sgStream[i]);
//        }

        /* (단순) 라인수 단축은 성공 했으나,
         -- 남은 문제 --
         1. !기준!의 데이터가 string[], int[], int[]에 나누어져 있다.
           => 데이터 변경에 조심해야함, 변경에 대한 시도와 테스트, 영향도 파악 등 많은 비용과 노력이 필요해짐
           왜?
           => 데이터 순서가 정해져 있지 않으므로
              정확하게 수정하지 않을경우 잘못된 값이 출력 등

        - final -
        기준이 되는 정보에 대해 추가 정보를 따로 따로 설정하는 것은
        관리하기 좋은 방식이 아니다.
        사람이 관리하기 좋은 방식 => 기준정보(하나의 개념)를 통해 여러 정보를 묶어서 처리하자

        ex)학생에서 비롯 된 이름, 나이, 성적을 관리하는 것
        => Class를 도입해서 처리하자
        **/
    }
}
