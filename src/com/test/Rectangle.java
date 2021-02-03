package com.javarush.test;

public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public  Rectangle(int top, int left, int width, int height){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=height;
    }public  Rectangle(int top, int left){
        this.top=top;
        this.left=left;
        this.width=0;
        this.height=0;
    }public  Rectangle(int top, int left, int width){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=width;
    }public  Rectangle(Rectangle rectangle){
        this.top= rectangle.top;
        this.left= rectangle.left;
        this.width= rectangle.width;
        this.height= rectangle.height;
    }

    public static void main(String[] args) {

    }

}
