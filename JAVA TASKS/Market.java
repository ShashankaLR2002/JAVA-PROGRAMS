package com.shamanth.task220824;

public class Market {
	 private String name;
	    private String location;

	    public Market(String name, String location) {
	        this.name = name;
	        this.location = location;
	    }

	    public void show() {
	        System.out.println("Market Name: " + this.name);
	        System.out.println("Location: " + this.location);
	    }

}
