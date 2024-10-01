package org.example.strategy;

public class CoffeeMachine {
    public String brew(CoffeeStrategy coffeeStrategy){
        //클라이언트 쪽에서 주입한 구현체에 따라서 어떤 커피를 내려줄 지 결정됨
        return coffeeStrategy.brew();
    }
}
