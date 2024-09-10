package com.shsh.EqualsandToStringOverride;
import java.util.Objects;
public class Kettle {
	 private String brand;
	    private double capacity;
	    private String material;
	    private boolean isElectric;
	    private String color;
	    private double power;

	    public Kettle(String brand, double capacity, String material, boolean isElectric, String color, double power) {
	        this.brand = brand;
	        this.capacity = capacity;
	        this.material = material;
	        this.isElectric = isElectric;
	        this.color = color;
	        this.power = power;
	    }

	    @Override
	    public String toString() {
	        return "Kettle [brand=" + brand + ", capacity=" + capacity + ", material=" + material +
	               ", isElectric=" + isElectric + ", color=" + color + ", power=" + power + "]";
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        
	        Kettle kettle = (Kettle) obj;
	        return Objects.equals(brand, kettle.brand) &&
	               Double.compare(kettle.capacity, capacity) == 0 &&
	               Objects.equals(material, kettle.material);
	    }
	

	

}
