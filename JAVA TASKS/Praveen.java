package com.shsh.inheritance2;

public class Praveen {
	public void off(Smartphone1 smartphone)
	{
		if(smartphone !=null)
		{
			smartphone.operate();
			smartphone.display();
		}
		else {
			System.out.println("smartphone is null");
		}
	}

}
