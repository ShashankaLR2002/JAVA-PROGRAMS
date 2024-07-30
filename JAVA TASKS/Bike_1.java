 class Bike_1
 {
    public static void twowheels(String brand) 
	{
        System.out.println("Brand: " + brand);
    }

    public static void speed(int maxSpeed, double acceleration) {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Acceleration: " + acceleration + " m/s²");
    }

    public static void details(String model, int year, boolean isElectric) {
        System.out.println("Model: " + model + ", Year: " + year + ", Electric: " + isElectric);
    }

    public static void performance(char rating, float mileage) {
        System.out.println("Rating: " + rating + ", Mileage: " + mileage + " km/l");
    }

    public static void specifications(String engineType, String color, double weight) {
        System.out.println("Engine Type: " + engineType + ", Color: " + color + ", Weight: " + weight + " kg");
    }

   
}
