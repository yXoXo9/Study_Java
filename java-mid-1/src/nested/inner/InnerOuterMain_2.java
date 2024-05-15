package nested.inner;

import java.util.Objects;

public class InnerOuterMain_2 {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter outer2 = new InnerOuter();
        // 'nested.inner.InnerOuter' is not an enclosing(둘러싸는) class
        // new InnerOuter.InnerC();
        /*
        * 생성 시 바깥 인스턴스의 참조 값 주소를 알아야만 가능하다.
        * 바깥 클래스의 인스턴스 멤버 (outInstanceValue)를 접근하기 위해선,
        * 인스턴스의 참조값을 알아야 인스턴스 멤버에 접근할 수 있는 것과 동일한 개념
        * */
        InnerOuter.InnerC innerC = outer.new InnerC();
        InnerOuter.InnerC innerC_2 = new InnerOuter().new InnerC();
        InnerOuter.InnerC innerC_3 = outer2.new InnerC();
        innerC.print();

        System.out.println("\nouter = \n" + Objects.toIdentityString(outer.getClass()));
        System.out.println("outer2 = \n" + Objects.toIdentityString(outer2.getClass()));
        outer.setValue(5);
        outer2.setValue(10);
        System.out.println("outer_1 = " + outer.getValue());
        System.out.println("outer_2 = " + outer2.getValue());

        System.out.println("outer_innerC = \n" + Objects.toIdentityString(innerC.getClass()));
        System.out.println("new InnerOuter()_innerC_2 = \n" + Objects.toIdentityString(innerC_2.getClass()));
        System.out.println("outer2_innerC_3 = \n" + Objects.toIdentityString(innerC_3.getClass()));

        System.out.println("\nString = \n" + Objects.toIdentityString(new String()));
        System.out.println("String_2 = \n" + Objects.toIdentityString(new String()));
        System.out.println("Integer = \n" + Objects.toIdentityString(new Integer(3)));
        System.out.println("Integer_2 = \n" + Objects.toIdentityString(new Integer(6)));
    }
}
