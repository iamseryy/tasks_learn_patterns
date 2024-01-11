package org.example;

public class SeniorJavaDeveloper extends DeveloperDecorator{
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " + " + makeReview();
    }

    public String makeReview() {
        return "Make review";
    }
}
