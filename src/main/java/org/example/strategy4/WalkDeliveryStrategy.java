package org.example.strategy4;

public class WalkDeliveryStrategy implements OrderStrategy {

    private String name;
    private String payType;
    private boolean useCoupon;
    private double discount;

    public WalkDeliveryStrategy(String name, String payType, boolean useCoupon, double discount){
        this.name = name;
        this.payType = payType;
        this.useCoupon = useCoupon;
        this.discount = discount;
    }
    @Override
    public void order(int totalPrice){
        int lastPrice = totalPrice;
        int discountPrice = (int)(totalPrice*discount);
        if(useCoupon){
            lastPrice = lastPrice-discountPrice;
        }
        System.out.println("도보 배달 시 총 지불금액은 "+lastPrice+"원입니다.");
    }
}
