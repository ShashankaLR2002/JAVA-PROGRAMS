class Number 
{
    public static String classifyNumber(int number)
{
        if (number < 0) 
		{
            return "Negative"; 
        } else if (number == 0) 
		{
            return "Zero"; 
        }
        return "Positive";
    }
	public static String determineSign(int number) {
        if (number < 0) {
            return "Negative";
        } else if (number == 0) {
            return "Zero";
        } else {
            return "Positive";
        }
    }
	  public static void determineSign1(int number) {
        if (number < 0) {
            System.out.println("Negative");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive");
        }
}
}