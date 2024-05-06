package enumeration.ref3;

import static enumeration.ref3.Grade.*;

public class Grade_Enum_Main_5 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        int pr = 10_000;
        System.out.println("BASIC 의 할인 금액 : " + BASIC.discount(pr));
        System.out.println("GOLD 의 할인 금액 : " + GOLD.discount(pr));
        System.out.println("DIAMOND 의 할인 금액 : " + DIAMOND.discount(pr));
    }
}
