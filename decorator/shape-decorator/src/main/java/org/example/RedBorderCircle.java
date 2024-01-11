package org.example;

public class RedBorderCircle extends ShapeDecorator{

    public RedBorderCircle(Shape shape) {
        super(shape);
    }

    private String makeRedBorder(){
        return "Make red border";
    }

    @Override
    public String draw() {
        return super.draw() + " + " + makeRedBorder();
    }
}
