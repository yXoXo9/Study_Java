 package class2_ref.ex;

 import java.util.Scanner;

 public class ProductOrderMain_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] arrProduct = new ProductOrder[n];

        for(int i = 0; i < arrProduct.length; i++){
            System.out.println((i+1) + " 번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = sc.nextLine();

            System.out.print("가격: ");
            int price = sc.nextInt();

            System.out.print("수량: ");
            int quantity = sc.nextInt();

            sc.nextLine(); // 입력 버퍼를 비우기 위한 코드

            arrProduct[i] = createOrder(productName, price, quantity);
        }

//      여러 상품의 주문 정보를 담는 배열 생성
//        ProductOrder[] arrProduct = {
//            createOrder("두부", 2000, 2)
//            , createOrder("김치", 5000, 1)
//            , createOrder("콜라", 1500, 2)
//        };
        printOrder(arrProduct);
        // ctrl + alt + v introduce variable
        System.out.println("총 결제 금액: " + getTotalAmount(arrProduct));
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
//      여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장.
        ProductOrder tmpPo = new ProductOrder();
        tmpPo.productName = productName;
        tmpPo.price = price;
        tmpPo.quantity = quantity;
        return tmpPo;
    }

    static void printOrder(ProductOrder[] arrPo){
//      사용해서 상품 주문 정보 출력
        for(ProductOrder getProductOrder : arrPo){
            System.out.println("상품명 : " + getProductOrder.productName + ", 가격: " + getProductOrder.price + ", 수량: " + getProductOrder.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] arrPo){
//      사용해서 총 결제 금액 계산
        int amount = 0;
        for(ProductOrder getProductOrder : arrPo){
            amount += getProductOrder.price * getProductOrder.quantity;
        }
        return amount;
    }

    // 출력 예시
    // 상품명 : 두부, 가격: 2000, 수량 : 2
    // 상품명 : 두부, 가격: 4000, 수량 : 1
    // 상품명 : 두부, 가격: 5000, 수량 : 6
    // 총 결제 금액 : 12000
}
