class HotelBookingRunner {
    public static void main(String[] args) 
    {
        double totalPrice = HotelBooking.book("Summer", false);
        System.out.println(totalPrice);
	    double totalPrice1 = HotelBooking.book("Winter", true);
        System.out.println(totalPrice1);
		double totalPrice2 = HotelBooking.book("Rainy", true);
        System.out.println(totalPrice2);
    }
}
