package com.bean;

public class Circle implements Shapes{

    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawn a Circle");
        System.out.println("radius is : "+radius);
    }


}
