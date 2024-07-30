public class MedicineInfoRunner 
{

    public static void main(String[] args) 
	{
        if (args.length == 4) {
            String Name = args[0];
			String ManufactureDate = args[1];
			String price = args[2];
			String quantity = args[3];
                int convertedQuantity = Integer.parseInt(quantity);
				float covertedprice = Float.parseFloat(price);
                MedicineInfo.medinfo(Name, ManufactureDate,covertedprice,convertedQuantity);
            
             
            
		}
		else 
		{
            System.out.println("Please provide exactly 4 arguments: name, manufacture date, price, and quantity.");
        }
    }
}
