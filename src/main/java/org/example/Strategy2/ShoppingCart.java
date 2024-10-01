package org.example.Strategy2;

import java.util.ArrayList;
import java.util.List;

//전략을 등록하고 실행
public class ShoppingCart {
    List<Item> items;

    public ShoppingCart(){
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    //전략을 매개변수로 받아서 바로바로 실행
    public void pay(PaymentStrategy paymentMethod){
        int amount = 0;
        for(Item item : items){
            amount += item.price;
        }
        paymentMethod.pay(amount);
    }

}
