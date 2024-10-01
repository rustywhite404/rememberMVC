package org.example.strategy4;

import java.util.ArrayList;
import java.util.List;

//전략을 등록하고 실행
public class OrderCart {
    List<Item> items = new ArrayList<>();

//    public OrderCart(){
//        items = new ArrayList<>();
//    }

    public void addItem(Item item){
        items.add(item);
    }
    public void totalPrice(OrderStrategy orderStrategy){
        int totalPrice = 0;
        for(Item item : items){
            totalPrice += item.getPrice()*item.getAmount()+item.getTip();
        }
        orderStrategy.order(totalPrice);
    }

}
