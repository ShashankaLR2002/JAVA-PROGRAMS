package com.shamanth.task220824;

public class Sandal {
	private String brand;
    private char size;
    private double cost;
    private String color;

    public Sandal(String brand, char size, double cost, String color) {
        this.brand = brand;
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public void show() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Size: " + this.size);
        System.out.println("Cost: " + this.cost);
        System.out.println("Color: " + this.color);
    }
	

}
