package org.example.strategy4;

public class Item {
    private String menu;
    private int price;
    private int amount;
    private int tip;
    public Item(String menu, int price, int amount, int tip) {
        this.menu = menu;
        this.price = price;
        this.amount = amount;
        this.tip = tip;
    }
    public String getMenu() {
        return menu;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public int getTip() {
        return tip;
    }
}
