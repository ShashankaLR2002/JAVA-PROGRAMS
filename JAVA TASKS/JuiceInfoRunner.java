class JuiceInfoRunner
{
	public static void main(String[] args)
	{
		if (args.length==5)
		{
			String Name = args[0];
			String Brand = args[1];
			String Flavour = args[2];
			String Price = args[3];
			String Quantity = args[4];
			float convertedprice = Float.parseFloat(Price);
			int convertedquantity = Integer.parseInt(Quantity);
			JuiceInfo.juice(Name,Brand,Flavour,convertedprice,convertedquantity);
			}
		else
		{
			System.out.println("Provide exactly 5 arguments Name,Brand,Flavour,Price,Quantity");
			
		}
		
	}

}


