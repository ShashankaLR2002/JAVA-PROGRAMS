package com.xworkz.practise.internal;

public class Board {
    private String name;
    private int size;

    protected Board() {
    	
    }

    public Board(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void printDetails() {
      
        System.out.println("Name: " + this.name);
        System.out.println("size: " + this.size);
}
}
