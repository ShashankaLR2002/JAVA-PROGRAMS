class HotelBooking
{
   
    static int SummerRoomprice = 5000;
    static int SummerFoodprice = 500;
    
    static int WinterRoomprice = 4000;
    static int WinterFoodprice = 400;
    
    static int RainyRoomprice = 3000;
    static int RainyFoodprice = 300;

    public static double book(String Package, boolean food)
    {
        int totalPrice = 0;

        if (Package == "Summer")
        {						
            if (food)
            {
                totalPrice = SummerRoomprice + SummerFoodprice;
				return totalPrice;
            }
		
            else
            {
                totalPrice = SummerRoomprice;
				return totalPrice;
            }
        }
		
        else if (Package == "Winter")
        {
            if (food)
            {
                totalPrice = WinterRoomprice + WinterFoodprice;
				return totalPrice;
            }

            else
            {
                totalPrice = WinterRoomprice;
				return totalPrice;
            }
        }
        else if (Package == "Rainy")
        {
            if (food)
            {
                totalPrice = RainyRoomprice + RainyFoodprice;
				return totalPrice;
            }

            else
            {
                totalPrice = RainyRoomprice;
				return totalPrice;
            }
        }
       return 0;
    }
}
