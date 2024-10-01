package org.example.strategy4;

public class User {
    public static void main(String[] args) {
        //주문카트 전략 컨텍스트 등록
        OrderCart cart = new OrderCart();

        //주문 메뉴
        Item A = new Item("새우버거",2000,1,2000);
        Item B = new Item("치즈피자", 5000,2,4000);
        cart.addItem(A);
        cart.addItem(B);

        cart.totalPrice(new TaxiDeliveryStrategy("김주문","현장결제","문 앞에 두고가주세요."));
        cart.totalPrice(new WalkDeliveryStrategy("이배달", "카드결제",true,0.2));
    }
}
