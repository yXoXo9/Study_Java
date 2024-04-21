package lang.immutable.test;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /* 불변 객체에서 값을 바꿔서 반환, 기존값을 사용해서 반환하는 경우
    * set 이 아닌 with 로 prefix 처리 (관례 상)
    * ex) coffee with sugar => 커피에 설탕이 추가되어 원래 상태를 변경해 새로운 커피를 만든다.
    * */

    public ImmutableMyDate withYear(int newYear){
        return new ImmutableMyDate(newYear, month, day);
    }

    public ImmutableMyDate withMonth(int newMonth){
        return new ImmutableMyDate(year, newMonth, day);
    }

    public ImmutableMyDate withDay(int newDay){
        return new ImmutableMyDate(year, month, newDay);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
