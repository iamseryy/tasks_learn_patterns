package org.example;

public class DeveloperDecorator implements Developer{
    private Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
       return this.developer.makeJob();
    }
}