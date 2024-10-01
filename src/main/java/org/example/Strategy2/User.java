package org.example.Strategy2;

public class User {
    public static void main(String[] args) {
        //쇼핑카트 전략 컨텍스트 등록
        ShoppingCart cart = new ShoppingCart();

        //쇼핑물품
        Item A = new Item("맥북 프로",10000);
        Item B = new Item("플레이스테이션",30000);
        cart.addItem(A);
        cart.addItem(B);

        //루나카드로 결제 전략 실행
        //카카오뱅크로 결제 전략 실행
        cart.pay(new LUNACardStrategy("abc@example.com","passluna"));
        cart.pay(new KakaoCardStrategy("eunju","239213841111","381","12/01"));
    }
}
