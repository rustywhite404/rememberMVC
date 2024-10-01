package org.example.strategy;

public class Road {

    public static void main(String[] args) {
        //도로 위에 커피머신을 설치합니다
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        //아메리카노 버튼을 누르면 아메리카노 전략을 넣어 아메리카노를 추출합니다.
        String americano = coffeeMachine.brew(new AmericanoStrategy());
        System.out.println(americano);
        //카페라떼 버튼을 누르면 카페라떼 전략을 넣어 카페라떼를 추출합니다.
        String caffelatte = coffeeMachine.brew(new CafeLatteStrategy());
        System.out.println(caffelatte);
    }
}
