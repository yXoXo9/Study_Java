package extends1.ex_0;

public class Album extends Item{
    private String artist;

    public Album(String name, int price, String artist) {
        /*super.name = name;
        super.price = price;*/
        super(name, price);
        this.artist = artist;
    }

    /* 손으로 입력했음...
     => 메서드 오버라이드
     */
    @Override
    protected void print(){
        super.print();
        System.out.println("- 아티스트 = " + artist);
    }
}
