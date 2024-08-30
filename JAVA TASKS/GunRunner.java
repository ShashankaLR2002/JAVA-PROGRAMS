package com.shsh.inheritance2;

public class GunRunner {
	public static void main(String[] args) {

		

	    	Soldier soldier= new Soldier();
			soldier.use();
			System.out.println("----------");

			Police police=new Police();
			Gun gun=new Gun("AK-47", "india", " ArmaLite rifle");
			police.hold(gun);
			System.out.println("----------");

			Dboss dboss=new Dboss(gun);
			dboss.hide();
			System.out.println("----------");

			Godse godse= new Godse();
			godse.work();

		}
}
