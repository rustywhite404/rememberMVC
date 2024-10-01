package org.example.Strategy2;

public class KakaoCardStrategy implements PaymentStrategy{

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public KakaoCardStrategy(String nm, String cdNumber, String cvv, String expiryDate){
        this.name = nm;
        this.cardNumber = cdNumber;
        this.cvv = cvv;
        this.dateOfExpiry = expiryDate;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount+"원 paid using KAKAOCard.");
    }
}
