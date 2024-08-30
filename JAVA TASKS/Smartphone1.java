package com.shsh.inheritance2;

public class Smartphone1 {
	private String Brand;
	private String model;
	private double price;

	public Smartphone1() {
		System.out.println("Creating a Smartphone with No agrs");	
		}

	public Smartphone1(String brand, String model, double price) {
		super();
		this.Brand = brand;
		this.model = model;
		this.price = price;
	}

	public void operate()
	{
		System.out.println("Running a operate in Smartphone");
	}

	public void display()
	{
		System.out.println("Running a display in Smartphone");
		System.out.println(this.Brand);
		System.out.println(this.model);
		System.out.println(this.price);
	}


}
