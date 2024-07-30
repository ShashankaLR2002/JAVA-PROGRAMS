class PaintRunner
 {
    public static void main(String[] args) 
	{
        Paint.brand("Asian");
        Paint.brandAndColor("Asian", "Red");
        Paint.brandAndPrice("Asian", 80);
        Paint.brandTypeAndPrice("Asian", "Oil", 80);
        
        Train.book("kalasa", "bengalore");
        Train.book("kalasa", "bengalore", 25);
        Train.book("kalasa", "bengalore", 25, 500.0);
        Train.cancel(12345);
        Train.cancel("kalasa", "bengalore");
		
		Bike_1.twowheels("Yamaha");
        Bike_1.speed(180, 3.5);
        Bike_1.details("R15", 2021, false);
        Bike_1.performance('A', 40.5f);
        Bike_1.specifications("V-twin", "Red", 150.0);
    }
}
