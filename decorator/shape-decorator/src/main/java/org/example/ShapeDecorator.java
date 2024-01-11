package org.example;

public class ShapeDecorator implements Shape{
    private Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String draw() {
        return this.shape.draw();
    }
}
