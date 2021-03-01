package com.test.fishingstore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FishingStore {


    public static void main(String[] args) throws IOException {
        List <FishingGoods> list = new ArrayList<>();
        FishingGoods fishingGoods1 = new FishingGoods("rod","spin",3,5);
        FishingGoods fishingGoods2 = new FishingGoods("bait","jig",10,4);
        FishingGoods fishingGoods4 = new FishingGoods("bait","bait",3,9);
        FishingGoods fishingGoods3 = new FishingGoods("reel","iner",5,7);
        list.add(fishingGoods1);
        list.add(fishingGoods2);
        list.add(fishingGoods3);
        list.add(fishingGoods4);

        System.out.println(countType(list));
        System.out.println(totalCount(list));
        System.out.println(totalPrice(list));
        System.out.println("Средняя стоимость = " + totalPrice(list)/totalCount(list));


    }

    public static List<FishingGoods> createList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<FishingGoods> list = new ArrayList<FishingGoods>();
        String type = "";
        String name = "";
        int count = 0;
        int price = 0;

        System.out.println("Введите тип товара, который хотите добавить, наименование, количество шт. и цену");
        type = reader.readLine();
        while (!type.equals("exit")) {

            type = reader.readLine();
            name= reader.readLine();
            count = Integer.parseInt(reader.readLine());
            price = Integer.parseInt(reader.readLine());

            FishingGoods fishingGoods = new FishingGoods(type, name, count, price);
            list.add(fishingGoods);
        }
            return list;
    }

    public static int countType(List<FishingGoods> list) {
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < list.size(); i++) {
            String type = list.get(i).getType();
            set.add(type);
        }
        int countType = set.size();
        return countType;
    }

    public static int totalCount(List<FishingGoods> list) {
        int totalCount = 0;
        for (int i = 0; i < list.size(); i++) {
            totalCount += list.get(i).getCount();
        }
        return totalCount;
    }

    public static int totalPrice(List<FishingGoods> list) {
        int totalPrice = 0;
        for (int i = 0; i < list.size(); i++) {

            totalPrice += list.get(i).getCount() * list.get(i).getPrice();
        }
        return totalPrice;
    }

    public static void averagePriceType(List<FishingGoods> list) {
        List<FishingGoods> listType = new ArrayList<>();

    }
}