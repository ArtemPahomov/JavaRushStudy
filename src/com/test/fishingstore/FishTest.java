package com.test.fishingstore;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class FishTest {
    public static void main(String[] args) {
        List<FishingGoods> list = new ArrayList<>();
        FishingGoods fishingGoods1 = new FishingGoods("rod","spin",3,5);
        FishingGoods fishingGoods2 = new FishingGoods("bait","jig",10,4);
        FishingGoods fishingGoods3 = new FishingGoods("bait","spoon",3,9);
        FishingGoods fishingGoods4 = new FishingGoods("reel","iner",5,7);
        FishingGoods fishingGoods5 = new FishingGoods("reel","iner",345,12);
        list.add(fishingGoods1);
        list.add(fishingGoods2);
        list.add(fishingGoods3);
        list.add(fishingGoods4);
        list.add(fishingGoods5);


        List<FishingGoods>typeList = new ArrayList<>();
        typeList.add(fishingGoods1);
        typeList.add(fishingGoods2);
        typeList.add(fishingGoods3);
        typeList.add(fishingGoods4);
        typeList.add(fishingGoods5);



        for (int i = 0; i < list.size(); i++) {
            double totalTypeCount = 0;
            double totalTypePrice = 0;
            int comp = 0;
            for (int k = 0; k < typeList.size(); k++) {
                if (list.get(i).getType().equals(typeList.get(k).getType())) {
                    totalTypeCount += typeList.get(k).getCount();
                    totalTypePrice += typeList.get(k).price * typeList.get(k).count;
                    typeList.remove(k);
                    k--;
                    comp++;
                }
            }
            if (comp != 0) {
                double value = totalTypePrice/totalTypeCount;
                BigDecimal res = new BigDecimal(value);
                res = res.setScale(2, RoundingMode.DOWN);
                System.out.println("Средняя стоимость товара типа " + list.get(i).type + " = " + res);
            }
        }
    }
}
