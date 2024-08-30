package com.shsh.inheritance2;

public class SmartphoneRunner1 {
	public static void main(String[] args) {

		Prashanth prashanth= new Prashanth();
		prashanth.use();
		System.out.println("........................");

		Praveen praveen = new Praveen();
		Smartphone1 smartphone=new Smartphone1("samsung", "s24", 150000);
		praveen.off(smartphone);
		System.out.println("......................");

		
		
		Ramesh ramesh=new Ramesh(smartphone);
		ramesh.damage();
		System.out.println("...........................");


		Harisha harisha = new Harisha();
		harisha.repare();

	}

}
