package access_6.ex;

public class MaxCounter {
    /* 최대값을 지정하고 최대값 까지만 값이 증가하는 기능을 제공한다. */
    private int count = 0;
    private int max = 0;

//    (default) => 같은 패키지 안에서만 호출할 수 있으므로 public
    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(){
        if(isValidCheckByMax()) {
            this.count++;
        }else{
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    public void increment2(){
        // 검증 로직
        if(count >= max){
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }

        // 실행 로직
        count++;

        // 검증 로직과 실행 로직을 좀 더 명확하게 구분하는 장점이 있음, if-else 와는 다른 스타일
    }

    public int getCount() {
        return count;
    }

    private boolean isValidCheckByMax(){
        return (max > count);
    }
}
