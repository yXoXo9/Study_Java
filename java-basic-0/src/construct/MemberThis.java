package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        // 이런경우 this 는 생략되어 있다. = 없어도 접근 가능
//        (this).nameField = nameParameter;
        nameField = nameParameter;

        /*
            항상 this를 적어주는 코딩 스타일이 있다.
            => 멤버 변수를 접근할 땐 무조건 this를 적어라 라는 의미가 됨.
            ==> 명시적으로 지역변수(매개변수)와 멤버변수(필드)를 눈에 보이도록 구분하는 것.
            ===> IDE가 발전하면서 색으로 구분해주기도 함....(그러면 굳이 안적어도 된다?)
            ===> IDE가 잘 발전하지 않았으면, this.를 써도 되지만 확실히 구분된다면 굳이 안쓰는 것도 고려해보자.
            ===> BUT, 이름이 중복되는 경우에는 사용하는편이 좋아보임

            ... 과거에 스타일, 관습에 대해 지금도 써야하는가 라고 물어볼 때
            ===> 객관적인(정량적인) 대답을 할 수 있는가? 없으면 생각을 한번 해봐야함.......
            ===> 무조건 적인 답습은 성장에 있어서 좋은 방향은 아니다.
            스킬 사용에 대한 물음을 가지는 습관은 버리지 말자.
        */
    }
}
