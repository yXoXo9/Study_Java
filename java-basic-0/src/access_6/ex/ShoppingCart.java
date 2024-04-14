package access_6.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
//        if(items.length > 10){
//            System.out.println("장바구니가 가득 찼습니다.");
//            return;
//        }
//       배열에 원소 넣기.............
//       items = item;
        /*--------------*/
        if(itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        } // 검증과 실행 로직 분리

        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems2(){

        System.out.println("장바구니 상품 출력");
        // p..
//        for (Item s : items){
//              private 접근제어자로 인해 클래스 외부에서 멤버변수, 필드는 호출할 수 없음.
//            System.out.println("상품명:" + s.name + ", 합계:" + s.price);
//        }
//        int sumAmount = 0;
//        for (Item s : items){
//            s.showAmountItem();
//            sumAmount += s.getTotalPrice();
//        }
//        for(int i=0; i < items.length; i++){
//            getItem.showAmountItem(); 애매한 메소드 기능 구현......같음
//            sumAmount += getItem.getTotalPrice();
//        }
        /*------------*/
        // p..
//        for(int i=0; i < items.length; i++){ => 10개로 이미 생성되어 있으므로 사용하면 NPE 발생
        for(int i=0; i < itemCount; i++){
            Item getItem =  items[i];
            System.out.println("상품명:" + getItem.getName() + ", 합계:" + getItem.getTotalPrice());
        }
//      => item의 카운트 만큼만 돌아야함,
//      (10개로 고정되어 있거나 들어가지 않은 공간까지 모두 스캔할 경우 NPE 및 불필요한 스캔)
//      System.out.println("전체 가격 합:"+sumAmount);
        System.out.println("전체 가격 합:"+calculateTotalPrice());
    }

    // p..
     /*----------------------- 카트 기준에서, 전체 가격을 구하는 메서드*/
    private int calculateTotalPrice(){
        int totalPrice = 0;
        for(int i=0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
