package com.shsh.EqualsandToStringOverride;
import java.util.Objects;
public class Saree {
	 private String brand;
	    private String color;
	    private String fabric;
	    private double price;
	    private String length;
	    private String design;

	    
	    public Saree(String brand, String color, String fabric, double price, String length, String design) {
	        this.brand = brand;
	        this.color = color;
	        this.fabric = fabric;
	        this.price = price;
	        this.length = length;
	        this.design = design;
	    }

	    
	    @Override
	    public String toString() {
	        return "Saree [brand=" + brand + ", color=" + color + ", fabric=" + fabric + 
	               ", price=" + price + ", length=" + length + ", design=" + design + "]";
	    }

	    
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;

	        Saree saree = (Saree) obj;
	        return Objects.equals(brand, saree.brand) &&
	               Objects.equals(color, saree.color) &&
	               Objects.equals(fabric, saree.fabric);
	    }
}
