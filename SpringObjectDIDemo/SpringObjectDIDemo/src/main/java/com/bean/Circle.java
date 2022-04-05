package com.bean;

public class Circle {
    private float radius;
    private Point center;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void display(){
        System.out.println("Inside Circle");
        System.out.println("radius of circle is: "+getRadius()+"And Center of circle can be given as: " +
                "("+getCenter().getX()+","+getCenter().getY()+")");

        System.out.println("Area of Circle is: "+(2*3.14*radius*radius));


    }
}
