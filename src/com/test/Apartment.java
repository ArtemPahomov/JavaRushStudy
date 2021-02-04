package com.test;

import java.util.ArrayList;
import java.util.List;

public class Apartment {
    public static void main(String[] args) {
        List<Apart> app = new ArrayList<Apart>();
        app.add(new OneRoomApt());
        app.add(new TwoRoomApt());
        app.add(new TreeRoomApt());
        cleanAllApartment(app);
    }

    public static void cleanAllApartment(List<Apart> apartList){
        for (Apart apart : apartList) {
            if (apart instanceof OneRoomApt){
                ((OneRoomApt) apart).clean1Room();
            }else if (apart instanceof TwoRoomApt){
                ((TwoRoomApt) apart).clean2Room();
            }else if (apart instanceof TreeRoomApt){
                ((TreeRoomApt) apart).clean3Room();
            }
        }
    }

    static interface Apart{

    }

    static class OneRoomApt implements Apart{
        void clean1Room(){
            System.out.println("1 комната убрана");
        }
    }static class TwoRoomApt implements Apart{
        void clean2Room(){
            System.out.println("2 комнаты убраны");
        }
    }static class TreeRoomApt implements Apart{
        void clean3Room(){
            System.out.println("3 комнаты убраны");
        }
    }
}
