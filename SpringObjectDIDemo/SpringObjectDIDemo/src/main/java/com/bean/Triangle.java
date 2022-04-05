package com.bean;

public class Triangle {

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private float base;
    private float height;


    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void display(){
        System.out.println("Inside Triangle");
        System.out.println("PointA is ("+getPointA().getX()+","+getPointA().getY()+")");
        System.out.println("PointB is ("+getPointB().getX()+","+getPointB().getY()+")");
        System.out.println("PointC is ("+getPointC().getX()+","+getPointC().getY()+")");

        System.out.println("Area od Triangle is: "+(0.5*base*height));

    }
}
