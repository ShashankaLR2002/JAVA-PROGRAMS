package com.shsh.superchaining;

public class Government {
    private String state;
    private int noOfMlas;

    public Government(String state, int noOfMlas) {
        this.state = state;
        this.noOfMlas = noOfMlas;
    }

    public void printDetails() {
        System.out.println("State: " + state);
        System.out.println("Number of MLAs: " + noOfMlas);
    }

    public Government copy() {
        return new Government(state, noOfMlas);
    }
}
