package com.shsh.EqualsandToStringOverride;
import java.util.Objects;

public class Jeans {
	
	 private String brand;
	    private String size;
	    private String color;
	    private double price;
	    private boolean isWashed;
	    private String fabric;

	    public Jeans(String brand, String size, String color, double price, boolean isWashed, String fabric) {
	        this.brand = brand;
	        this.size = size;
	        this.color = color;
	        this.price = price;
	        this.isWashed = isWashed;
	        this.fabric = fabric;
	    }

	    @Override
	    public String toString() {
	        return "Jeans [brand=" + brand + ", size=" + size + ", color=" + color +
	               ", price=" + price + ", isWashed=" + isWashed + ", fabric=" + fabric + "]";
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        
	        Jeans jeans = (Jeans) obj;
	        return Objects.equals(brand, jeans.brand) &&
	               Objects.equals(size, jeans.size) &&
	               Objects.equals(color, jeans.color);
	    }

}
