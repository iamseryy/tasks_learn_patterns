package org.example;

public class Main {
    public static void main(String[] args) {
        Shape shapeCircle = new Circle();
        System.out.println(shapeCircle.draw());

        Shape redCircle = new RedBorderCircle(shapeCircle);
        System.out.println(redCircle.draw());
    }
}