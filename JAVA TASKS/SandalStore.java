package com.shamanth.task220824;

public class SandalStore {
	 private Sandal[] sandals = new Sandal[5];
	    private int index = 0;

	    public void save(Sandal sandal) {
	        System.out.println("Save Sandal Data");
	        this.sandals[this.index] = sandal;
	        this.index++;
	    }

	    public void display() {
	        System.out.println("Display Sandal Data");
	        for (Sandal sandal : this.sandals) {
	            if (sandal != null) {
	                sandal.show();
	            } else {
	                System.out.println("Data is Null");
	            }
	        }
	    }

}
