package com.shsh.superchaining;

public class Market {
    private String name;
    private String location;

    public Market(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void printDetails() {
        System.out.println("Market Name: " + name);
        System.out.println("Location: " + location);
    }

    public Market copy() {
        return new Market(name, location);
    }
}
