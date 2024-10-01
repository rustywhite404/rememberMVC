package org.example.strategy4;

public class TaxiDeliveryStrategy implements OrderStrategy {

    private String name;
    private String payType;
    private String message;

    public TaxiDeliveryStrategy(String name, String payType, String message){
        this.name = name;
        this.payType = payType;
        this.message = message;
    }
    @Override
    public void order(int totalPrice) {
        System.out.println("택시 배달 시 총 지불금액은 "+totalPrice+"원입니다.");
    }
}
