package com.shsh.EqualsandToStringOverride;
import java.util.Objects;
public class Gun1 {
	  private String brand;
	    private String model;
	    private double caliber;
	    private double weight;
	    private boolean isAutomatic;
	    private String country;

	  
	    public Gun1(String brand, String model, double caliber, double weight, boolean isAutomatic, String country) {
	        this.brand = brand;
	        this.model = model;
	        this.caliber = caliber;
	        this.weight = weight;
	        this.isAutomatic = isAutomatic;
	        this.country = country;
	    }

	   
	    @Override
	    public String toString() {
	        return "Gun [brand=" + brand + ", model=" + model + ", caliber=" + caliber +
	               ", weight=" + weight + ", isAutomatic=" + isAutomatic + ", country=" + country + "]";
	    }

	   
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;

	        Gun1 gun = (Gun1) obj;
	        return Objects.equals(brand, gun.brand) &&
	               Objects.equals(model, gun.model) &&
	               Double.compare(gun.caliber, caliber)==0;
	    }

}
