package com.shamanth.task220824;

public class MarketStore {
	 private Market[] markets = new Market[5];
	    private int index = 0;

	    public void save(Market market) {
	        System.out.println("Save Market Data");
	        this.markets[this.index] = market;
	        this.index++;
	    }

	    public void display() {
	        System.out.println("Display Market Data");
	        for (Market market : this.markets) {
	            if (market != null) {
	                market.show();
	            } else {
	                System.out.println("Data is Null");
	            }
	        }
	    }

}
