package com.shamanth.task220824;

public class SideDishStore {
	 private SideDish[] sideDishes = new SideDish[5];
	    private int index = 0;

	    public void save(SideDish sideDish) {
	        System.out.println("Save SideDish Data");
	        this.sideDishes[this.index] = sideDish;
	        this.index++;
	    }

	    public void display() {
	        System.out.println("Display SideDish Data");
	        for (SideDish sideDish : this.sideDishes) {
	            if (sideDish != null) {
	                sideDish.show();
	            } else {
	                System.out.println("Data is Null");
	            }
	        }
	    }

}
