package lang.math;

import java.util.Random;

public class RandomMain_1 {
    public static void main(String[] args) {
        Random random = new Random();
        doRandom(random);

        /* Seed
        * 랜덤은 내부에서 시드(Seed) 값을 사용해 랜덤 값을 구한다.
        * 시드 값이 같을경우 항상 같은 결과가 출력된다.
        * */
        int s = 20;
        System.out.println("\n시드 입력("+s+")");
        Random seedRandom = new Random(s);
        doRandom(seedRandom); // 항상 고정된 결과 출력
    }

    private static void doRandom(Random random) {
        int rInt = random.nextInt();
        System.out.println("rInt : " + rInt); // -210358033 ...

        double rDouble = random.nextDouble();
        System.out.println("rDouble = " + rDouble); // 0.045767866968039694 ...

        boolean rBoolean = random.nextBoolean();
        System.out.println("rBoolean = " + rBoolean); // true ...

        // 범위 조회
        int rIntArrange = random.nextInt(10); // 0 ~ 9 까지 출력;
        System.out.println("rIntArrange(10) / 0~9 : " + rIntArrange);

        int rIntArrange2 = random.nextInt(10) + 1; // (1 : bound) 1 ~ 10 까지 출력;
        System.out.println("rIntArrange2(10) + 1 / 1~10 : " + rIntArrange2);
    }
}
