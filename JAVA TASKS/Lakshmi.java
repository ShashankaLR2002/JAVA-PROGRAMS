package com.shsh.inheritance2;

public class Lakshmi {
	public void dry(WashingMachine washingmachine)
	{
		if(washingmachine !=null) {
		washingmachine.rinse();
		washingmachine.show();
		}
		else {
			System.out.println("Washing Machine Is Null");
		}
	}

}
