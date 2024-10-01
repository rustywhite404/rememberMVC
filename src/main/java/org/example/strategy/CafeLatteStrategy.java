package org.example.strategy;

public class CafeLatteStrategy implements CoffeeStrategy{
    private static final String CAFELATTE = "카페라떼";

    @Override
    public String brew() {
        //카페라떼를 내리다
        return CAFELATTE;
    }
}
