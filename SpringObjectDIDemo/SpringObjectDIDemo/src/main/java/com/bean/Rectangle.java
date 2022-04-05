package com.bean;

public class Rectangle {

    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void display(){
        System.out.println("Length and breadth of rectangle is: "+getLength()+","+getBreadth());
        System.out.println("Area of Rectangle is: "+(length*breadth));
    }
}
