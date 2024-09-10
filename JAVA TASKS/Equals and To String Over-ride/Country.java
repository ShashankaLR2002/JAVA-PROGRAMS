package com.shsh.EqualsandToStringOverride;
import java.util.Objects;
public class Country {
	
	 private String name;
	    private String capital;
	    private double population;
	    private String language;
	    private String currency;
	    private double area;

	    
	    public Country(String name, String capital, double population, String language, String currency, double area) {
	        this.name = name;
	        this.capital = capital;
	        this.population = population;
	        this.language = language;
	        this.currency = currency;
	        this.area = area;
	    }

	   
	    @Override
	    public String toString() {
	        return "Country [name=" + name + ", capital=" + capital + ", population=" + population +
	               ", language=" + language + ", currency=" + currency + ", area=" + area + "]";
	    }

	    
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;

	        Country country = (Country) obj;
	        return Objects.equals(name, country.name) &&
	               Objects.equals(capital, country.capital) &&
	               Double.compare(country.population, population) == 0;
	    }
	
}
