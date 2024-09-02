package com.shsh.superchaining;

public class StateGovernment extends Government {
    private String partyHeadName;
    private String homeMinsterName;

    public StateGovernment(String state, int noOfMlas, String partyHeadName, String homeMinsterName) {
        super(state, noOfMlas);
        this.partyHeadName = partyHeadName;
        this.homeMinsterName = homeMinsterName;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Party Head Name: " + partyHeadName);
        System.out.println("Home Minister Name: " + homeMinsterName);
    }
}
