package org.example;

public class Main {
    public static void main(String[] args) {
        Developer javaDeveloper = new JavaDeveloper();
        System.out.println(javaDeveloper.makeJob());

        Developer seniorDeveloper = new SeniorJavaDeveloper(javaDeveloper);
        System.out.println(seniorDeveloper.makeJob());

        Developer teamLead = new TeamLead(seniorDeveloper);
        System.out.println(teamLead.makeJob());
    }
}