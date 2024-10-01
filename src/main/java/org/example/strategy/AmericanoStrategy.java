package org.example.strategy;

public class AmericanoStrategy implements CoffeeStrategy{
    private static final String AMERICANO = "아메리카노";
    @Override
    public String brew() {
        //아메리카노를 내리느다
        return AMERICANO;
    }
}
