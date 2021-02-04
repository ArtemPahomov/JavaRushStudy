package com.test;

public class Computer {
    private Keyboard keyboard;
    private CompMouse compMouse;
    private Monitor monitor;

    public Computer(Keyboard keyboard, CompMouse compMouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.compMouse = compMouse;
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public CompMouse getCompMouse() {
        return compMouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
