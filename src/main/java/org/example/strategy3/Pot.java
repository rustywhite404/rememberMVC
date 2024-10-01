package org.example.strategy3;

public class Pot {
    public String cook(BoiledStrategy boiledStrategy){
        // 요리사가 넣은 재료에 따라서 어떤 레시피를 실행 할 지 결정됨
        //= 클라이언트가 주입한 매개변수에 따라서 어떤 구현체를 실행 할 지 결정됨
        return boiledStrategy.boiled();
    }
}
