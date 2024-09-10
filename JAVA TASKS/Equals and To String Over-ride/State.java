package com.shsh.EqualsandToStringOverride;
import java.util.Objects;
public class State {
	  private String name;
	    private String capital;
	    private double population;
	    private String language;
	    private String governor;
	    private double area;

	    
	    public State(String name, String capital, double population, String language, String governor, double area) {
	        this.name = name;
	        this.capital = capital;
	        this.population = population;
	        this.language = language;
	        this.governor = governor;
	        this.area = area;
	    }

	    
	    @Override
	    public String toString() {
	        return "State [name=" + name + ", capital=" + capital + ", population=" + population +
	               ", language=" + language + ", governor=" + governor + ", area=" + area + "]";
	    }

	  
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;

	        State state = (State) obj;
	        return Objects.equals(name, state.name) &&
	               Objects.equals(capital, state.capital) &&
	               Double.compare(state.population, population) == 0;
	    }
}
