package lang.math.test;

public class LottoMain_1 {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();

        System.out.println("getNumber : " + lottoGenerator.getNumber());
    }

    /*public static void main(String[] args) {
     *//*
     * 로또 번호를 자동으로 만들어주는 생성기
     * 1~45 사이의 숫자 6개를 뽑아야 한다.
     * 각 숫자는 중복되면 안된다.
     * 실행할 때 마다 결과가 달라야 한다.
     * *//*

        Random random = new Random();

        boolean prc = true;
        int iBoundValue = random.nextInt(45) + 1;
        while(prc){
            System.out.println("while_iBoundValue = " + iBoundValue);
            if(iBoundValue == 0){
                prc = false;
            }
            iBoundValue = random.nextInt(45);
        }
    }*/
}
