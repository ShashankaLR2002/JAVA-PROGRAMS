package com.shamanth.task220824;

public class SandalRunner {

	public static void main(String[] args) {
		 SandalStore sandalStore = new SandalStore();
		 

	        Sandal sandal1 = new Sandal("Nike", 'L', 1500, "Black");
	        Sandal sandal2 = new Sandal("Adidas", 'M', 1400, "White");
	        Sandal sandal3 = new Sandal("Puma", 'S', 1300, "Blue");
	        Sandal sandal4 = new Sandal("Reebok", 'L', 1600, "Red");
	        Sandal sandal5 = new Sandal("Sketchers", 'L', 1700, "Green");

	        sandalStore.save(sandal1);
	        sandalStore.save(sandal2);
	        sandalStore.save(sandal3);
	        sandalStore.save(sandal4);
	        sandalStore.save(sandal5);

	        sandalStore.display();

	       
	        MarketStore marketStore = new MarketStore();

	        Market market1 = new Market("SuperMart", "MG Road");
	        Market market2 = new Market("FreshMarket", "Koramangala");
	        Market market3 = new Market("LocalMarket", "Jayanagar");
	        Market market4 = new Market("MegaMarket", "Whitefield");
	        Market market5 = new Market("DiscountMarket", "Rajajinagar");

	        marketStore.save(market1);
	        marketStore.save(market2);
	        marketStore.save(market3);
	        marketStore.save(market4);
	        marketStore.save(market5);

	        marketStore.display();

	       
	        SideDishStore sideDishStore = new SideDishStore();

	        SideDish sideDish1 = new SideDish("Fries", 50, "Snack");
	        SideDish sideDish2 = new SideDish("Salad", 30, "Appetizer");
	        SideDish sideDish3 = new SideDish("Garlic Bread", 40, "Snack");
	        SideDish sideDish4 = new SideDish("Mashed Potatoes", 60, "Side Dish");
	        SideDish sideDish5 = new SideDish("Coleslaw", 35, "Side Dish");

	        sideDishStore.save(sideDish1);
	        sideDishStore.save(sideDish2);
	        sideDishStore.save(sideDish3);
	        sideDishStore.save(sideDish4);
	        sideDishStore.save(sideDish5);

	        sideDishStore.display();
	    }

}
