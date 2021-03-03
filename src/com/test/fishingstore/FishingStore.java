package com.test.fishingstore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class FishingStore {


    public static void main(String[] args) throws IOException {
        List <FishingGoods> list = new ArrayList<>();
        FishingGoods fishingGoods1 = new FishingGoods("rod","spin",3,5);
        FishingGoods fishingGoods2 = new FishingGoods("bait","jig",10,4);
        FishingGoods fishingGoods4 = new FishingGoods("bait","bait",3,9);
        FishingGoods fishingGoods3 = new FishingGoods("reel","inner",5,7);
        list.add(fishingGoods1);
        list.add(fishingGoods2);
        list.add(fishingGoods3);
        list.add(fishingGoods4);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Что бы узнать :\n" +
                "Сколько типов товаров магазине - введите countType\n" +
                "Общее количество товаров - введите totalCount\n"+
                "Среднюю стоимость товара - введите averagePrice\n"+
                "Среднюю стоимость товара каждого типа - введите averagePriceType\n"+
                "Для завершения - введите exit");

        String command = reader.readLine();
        while (!command.equals("exit"))
            switch (command) {
                case "countType":
                    System.out.println("Типов товаров - " + countType(list));
                    command = reader.readLine();
                    break;
                case "totalCount":
                    System.out.println("Общее количество товара - " + totalCount(list) + ".");
                    command = reader.readLine();
                    break;
                case "averagePrice":
                    System.out.println("Средняя стоимость = " + totalPrice(list) / totalCount(list));
                    command = reader.readLine();
                    break;
                case "averagePriceType":
                    averagePriceType(list);
                    command = reader.readLine();
                    break;
                default:
                    System.out.println("Команда не корректна");
                    command = reader.readLine();
            }
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
        List<FishingGoods> typeList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            typeList.add(list.get(i));
        }

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