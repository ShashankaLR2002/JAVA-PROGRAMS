package com.shsh.superchaining;

public class SubUrbanTrain extends Train {
    private String destination;

    public SubUrbanTrain(String no, String source, String destination) {
        super(no, source);
        this.destination = destination;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Destination: " + destination);
    }
}
