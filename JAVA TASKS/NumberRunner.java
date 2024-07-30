public class NumberRunner
 {
    public static void main(String[] args) 
	{
        String result = Number.classifyNumber(1);
        System.out.println("The number is: "+result);  
		String result1 = Number.determineSign(1);
        System.out.println("The number is: "+result1); 
        System.out.print("The number is: ");
		Number.determineSign1(0);
    }
}
