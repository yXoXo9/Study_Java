package extends1.ex_0;

public class Movie extends Item{
    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        /*super.name = name;
        super.price = price;*/
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    /* 손으로 입력했음...
     => 메서드 오버라이드
     */
    @Override
    protected void print(){
        super.print();
        System.out.println("- 감독 = " + director + ", 배우 = " + actor);
    }
}
