package extends1.ex_0;

public class Item {
    /*
    public String name;
    public int price;
    */
    private String name;
    private int price;

    /*
    * 생성자
    * */
    protected Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    protected void print(){
        System.out.println("이름 = " + name + ", 가격 = " + price);
    }

    protected int getPrice(){
        return price;
    }
}
