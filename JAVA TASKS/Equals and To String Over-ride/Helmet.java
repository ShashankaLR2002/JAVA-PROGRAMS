package com.shsh.EqualsandToStringOverride;
import java.util.Objects;
public class Helmet {
	 private String brand;
	    private String size;
	    private String color;
	    private double price;
	    private boolean isFullFace;
	    private String material;

	 
	    public Helmet(String brand, String size, String color, double price, boolean isFullFace, String material) {
	        this.brand = brand;
	        this.size = size;
	        this.color = color;
	        this.price = price;
	        this.isFullFace = isFullFace;
	        this.material = material;
	    }

	    
	    @Override
	    public String toString() {
	        return "Helmet [brand=" + brand + ", size=" + size + ", color=" + color +
	               ", price=" + price + ", isFullFace=" + isFullFace + ", material=" + material + "]";
	    }

	  
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;

	        Helmet helmet = (Helmet) obj;
	        return Objects.equals(brand, helmet.brand) &&
	               Objects.equals(size, helmet.size) &&
	               Objects.equals(color, helmet.color);
	    }
}
