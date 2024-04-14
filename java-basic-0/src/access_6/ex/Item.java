package access_6.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public void showAmountItem(){
        System.out.println("상품명:"+name+", 합계:"+(price*quantity));
    }

    // p..
    /* 합계 계산을 카트에서 할 것인가 아이템에 할 것인가?
    * 누가 계산하는 것이 좋은가?
    * 내것(아이템)의 입장에서 본인의 필드를 통해 계산하는 것이므로
    * 아이템에서 계산하는 것이 객체 지향적, 캡슐화에 더 가까움
    * */
//    public int getAmount(){
    public int getTotalPrice(){
        return price*quantity;
    }
}
