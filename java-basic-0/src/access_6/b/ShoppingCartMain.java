package access_6.b;

import access_6.ex.Item;
import access_6.ex.ShoppingCart;

public class ShoppingCartMain {
    public static void main(String[] args) {
        /*
        * 접근 제어자를 통해 데이터를 캡슐화할 것
        * 해당 클래스는 다른 패키지에서도 사용가능
        * 상품은 최대 10개만 담을 수 있다.
        *   초과 시 "장바구니가 가득 찼습니다."출력
        * */
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추",3000,4);

        cart.addItem(item1);
        cart.addItem(item2);

//        alt + enter
        cart.displayItems2();
    }
}
