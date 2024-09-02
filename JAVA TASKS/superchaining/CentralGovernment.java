package com.shsh.superchaining;

public class CentralGovernment extends Government {
    private String partyHeadName;
    private String homeMinsterName;

    public CentralGovernment(String state, int noOfMlas, String partyHeadName, String homeMinsterName) {
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
