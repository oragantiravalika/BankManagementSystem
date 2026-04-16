package com.oops;

abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Main {
    double radius = 5;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Main {
    int length = 10;
    int width = 4;

    void calculateArea() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.calculateArea();

        Rectangle r = new Rectangle();
        r.calculateArea();
    }
}
