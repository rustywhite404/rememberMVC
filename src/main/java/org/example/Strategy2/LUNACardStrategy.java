package org.example.Strategy2;

public class LUNACardStrategy implements PaymentStrategy{

    private String emailId;
    private String password;

    public LUNACardStrategy(String email, String pwd){
        this.emailId = email;
        this.password = pwd;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount+"원 paid using LUNACard");
    }
}
