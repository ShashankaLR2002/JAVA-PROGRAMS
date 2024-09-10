package com.shsh.EqualsandToStringOverride;
import java.util.Objects;
public class Bedsheet {
	 private String brand;
	    private String size;
	    private String color;
	    private String fabric;
	    private double price;
	    private String design;

	    
	    public Bedsheet(String brand, String size, String color, String fabric, double price, String design) {
	        this.brand = brand;
	        this.size = size;
	        this.color = color;
	        this.fabric = fabric;
	        this.price = price;
	        this.design = design;
	    }

	    
	    @Override
	    public String toString() {
	        return "Bedsheet [brand=" + brand + ", size=" + size + ", color=" + color + 
	               ", fabric=" + fabric + ", price=" + price + ", design=" + design + "]";
	    }

	    
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;

	        Bedsheet bedsheet = (Bedsheet) obj;
	        return Objects.equals(brand, bedsheet.brand) &&
	               Objects.equals(size, bedsheet.size) &&
	               Objects.equals(fabric, bedsheet.fabric);
	    }
}
