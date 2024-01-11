package org.example;

public class TeamLead extends DeveloperDecorator{
    public TeamLead(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " + " + sendReport();
    }

    public String sendReport(){
        return "Send report";
    }
}
