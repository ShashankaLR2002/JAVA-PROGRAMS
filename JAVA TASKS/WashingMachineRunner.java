package com.shsh.inheritance2;

public class WashingMachineRunner {
	public static void main(String[] args) {

		Megha megha =new Megha();
		megha.wash();
		System.out.println("---------");

		Lakshmi lakshmi= new Lakshmi();
		WashingMachine washingmachine= new WashingMachine("samsung", "Front Load", 5);
		lakshmi.dry(washingmachine);
		System.out.println("---------");

		WashingMachine washingmachine1= new WashingMachine("LG", "Top Load", 8);

		Abhishek abhishek= new Abhishek(washingmachine1);
		abhishek.crush();
		System.out.println("---------");


		Bhumika bhumika = new Bhumika(); 
		bhumika.repare();

	}

}
