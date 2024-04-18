package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }
    /* (사용자가 정의)
    @Override // Object 객체로부터 상속 받은 메서드
    public boolean equals(Object obj){
       UserV2 user = (UserV2) obj;

       // userV2의 동등성의 기준은 id로 처리 (사용자가 정의)
       return id.equals(user.id);
    }*/

    /*
    * 자동 생성한 equals() 메서드
    * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

    // Collection 을 알아야 이해할 수 있다.
    /*@Override
    public int hashCode() {
        return Objects.hash(id);
    }*/
}
