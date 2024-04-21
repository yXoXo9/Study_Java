package lang.immutable.test;

public class MyDate {
    /*
    * 불변이 아니어서 공유 참조시 사이드 이펙트가 발생한다, 이를 불변 클래스로 처리할 것
    * new ImmutableClassNm => 'ImmutableMyDate' 으로 생성
    * new ImmutableClass_ProcessMain => 'ImmutableMyDateMain' 으로 생성
    * */

    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
