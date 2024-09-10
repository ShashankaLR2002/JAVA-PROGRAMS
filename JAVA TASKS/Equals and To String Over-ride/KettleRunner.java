package com.shsh.EqualsandToStringOverride;

public class KettleRunner
{

	public static void main(String[] args) 
	{
	
		     
		        Jeans jeans1 = new Jeans("Wrangler", "30", "Black", 55.0, true, "Cotton");
		        Jeans jeans2 = new Jeans("Wrangler", "34", "Black", 48.0, false, "Cotton");
		        System.out.println("Jeans comparison: " + jeans1.equals(jeans2));  

		      
		        Kettle kettle1 = new Kettle("Bosch", 1.7, "Plastic", true, "White", 1800);
		        Kettle kettle2 = new Kettle("Bosch", 1.7, "Plastic", false, "White", 1500);
		        System.out.println("Kettle comparison: " + kettle1.equals(kettle2));  

		      
		        Grinder grinder1 = new Grinder("Philips", 4, 1.8, true, "Red", 2200);
		        Grinder grinder2 = new Grinder("Philips", 4, 1.8, false, "Red", 2100);
		        System.out.println("Grinder comparison: " + grinder1.equals(grinder2));  

		  
		        Saree saree1 = new Saree("Kanchipuram", "Green", "Cotton Silk", 2500.0, "6m", "Designer");
		        Saree saree2 = new Saree("Kanchipuram", "Green", "Cotton Silk", 2600.0, "6m", "Casual");
		        System.out.println("Saree comparison: " + saree1.equals(saree2));  

		     
		        Bedsheet bedsheet1 = new Bedsheet("DDecor", "Queen", "Beige", "Satin", 1200.0, "Floral");
		        Bedsheet bedsheet2 = new Bedsheet("DDecor", "Queen", "Beige", "Satin", 1100.0, "Stripes");
		        System.out.println("Bedsheet comparison: " + bedsheet1.equals(bedsheet2));  

		     
		        Bulb1 bulb1 = new Bulb1("Syska", "CFL", 11.0, "Cool White", 150.0, true);
		        Bulb1 bulb2 = new Bulb1("Syska", "CFL", 11.0, "Cool White", 130.0, false);
		        System.out.println("Bulb comparison: " + bulb1.equals(bulb2));  

		        
		        Gun1 gun1 = new Gun1("SmithWesson", "Revolver", 0.38, 2.0, true, "USA");
		        Gun1 gun2 = new Gun1("SmithWesson", "Revolver", 0.38, 1.9, false, "USA");
		        System.out.println("Gun comparison: " + gun1.equals(gun2));

		     
		        Country country1 = new Country("USA", "Washington D.C.", 331.0, "English", "USD", 9.83);
		        Country country2 = new Country("USA", "Washington D.C.", 331.0, "Spanish", "USD", 9.83);
		        System.out.println("Country comparison: " + country1.equals(country2));  

		    
		        State state1 = new State("California", "Sacramento", 39.5, "English", "Governor1", 423.0);
		        State state2 = new State("California", "Sacramento", 39.5, "English", "Governor2", 423.0);
		        System.out.println("State comparison: " + state1.equals(state2));  

		     
		        CreditCard card1 = new CreditCard("9876543210", "John Doe", "11/23", 40000.0, "XYZ Bank", true);
		        CreditCard card2 = new CreditCard("9876543210", "John Doe", "11/23", 45000.0, "XYZ Bank", false);
		        System.out.println("CreditCard comparison: " + card1.equals(card2));  

		    
		        Helmet helmet1 = new Helmet("Studds", "L", "Grey", 1700.0, true, "Fiberglass");
		        Helmet helmet2 = new Helmet("Studds", "L", "Grey", 1600.0, false, "Fiberglass");
		        System.out.println("Helmet comparison: " + helmet1.equals(helmet2));  
		    }
		

		
 
	    }
	

