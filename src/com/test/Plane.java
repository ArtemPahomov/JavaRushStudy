package com.test;

public class Plane implements CanFly{
    @Override
    public void fly() {

    }
    int countPassenger;
    public Plane(int countPassenger){
        this.countPassenger=countPassenger;
    }
}
