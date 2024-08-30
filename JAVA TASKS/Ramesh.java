package com.shsh.inheritance2;

public class Ramesh {
	private Smartphone1 smartphone;

	public Ramesh(Smartphone1 smartphone) {
		this.smartphone=smartphone;
	}

	public void damage()
	{
		if(smartphone !=null) {
			smartphone.display();
		}
		else {
			System.out.println("Smartphone is Null");
		}
	}

}
