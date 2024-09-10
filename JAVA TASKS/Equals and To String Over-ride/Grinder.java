package com.shsh.EqualsandToStringOverride;
import java.util.Objects;
public class Grinder {
	
	private String brand;
    private int speed;
    private double capacity;
    private boolean isWet;
    private String color;
    private double price;

    
    public Grinder(String brand, int speed, double capacity, boolean isWet, String color, double price) {
        this.brand = brand;
        this.speed = speed;
        this.capacity = capacity;
        this.isWet = isWet;
        this.color = color;
        this.price=price;
    }

   
    @Override
    public String toString() {
        return "Grinder [brand=" + brand + ", speed=" + speed + ", capacity=" + capacity +
               ", isWet=" + isWet + ", color=" + color + ", price=" + price + "]";
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Grinder grinder = (Grinder) obj;
        return Objects.equals(brand, grinder.brand) &&
               speed == grinder.speed &&
               Double.compare(grinder.capacity, capacity) == 0;
    }

}
