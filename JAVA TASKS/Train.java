class Train 
{
    public static void book(String source, String destination) 
	{
        System.out.println(source + " is the source and destination is " + destination);
    }

    public static void book(String source, String destination, int quantity) {
        System.out.println(source + " is the source, destination is " + destination + " and quantity is " + quantity);
    }

    public static void book(String source, String destination, int quantity, double price) {
        System.out.println(source + " is the source, destination is " + destination + ", quantity is " + quantity + " and price is " + price);
    }

    public static void cancel(int ticketNo) {
        System.out.println("Ticket with number " + ticketNo + " has been canceled.");
    }

    public static void cancel(String source, String destination) {
        System.out.println("Booking from " + source + " to " + destination + " has been canceled.");
    }
}
