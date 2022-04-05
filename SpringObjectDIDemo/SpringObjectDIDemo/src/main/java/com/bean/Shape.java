package com.bean;

public class Shape {
    private Triangle triangle;
    private Circle circle;
    private Rectangle rectangle;

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void display(){
        triangle.display();
        circle.display();
        rectangle.display();
    }
}
