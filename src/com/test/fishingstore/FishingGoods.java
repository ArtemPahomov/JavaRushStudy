package com.test.fishingstore;

public class FishingGoods {

    int price;
    int count;
    String name;
    String type;

    public FishingGoods(String type,String name, int count,int price){
        this.type=type;
        this.name =name;
        this.count = count;
        this.price = price;

    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
