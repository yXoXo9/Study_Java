package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {

        UserV1 userV1 = new UserV1("id-1234");
        UserV1 userV2 = new UserV1("id-1234");

        System.out.println("identity = " + (userV1 == userV2));

        // Object 가 기본으로 제공하는 equals() 는 == 으로 동일성 비교를 제공한다.
        /*
        * user1.equals(user2)
        * return (user1 == user2)
        * return (X001 == X002)
        *   return false
        * */
        System.out.println("Equality = " + (userV1.equals(userV2)));

        /*
        * 즉, 동등성이라는 개념은 사용자가 만든 클래스 별로 다 다르다.
        * 예) 멤버변수1 을 기준으로 동등성을 처리할 수 있고,
        * 멤버변수2로 처리할 수 있다.
        *
        * 이에 Object 의 동등성 비교 시 equals() 메서드를 Override 후 사용해야
        * 사용자가 정의한 로직대로 클래스 간 동등성을 비교한다.
        * */
    }
}
