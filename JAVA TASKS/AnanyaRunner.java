public class AnanyaRunner 
{
    public static void main(String[] args) 
	{
        Knife knife = new Knife(2.2, 3.0);
        Ananya ananya = new Ananya(723654789L, knife);
        ananya.store();

        Knife knife1 = new Knife(2.8, 3.8);
        Ananya ananya1 = new Ananya(7789456123L, knife1);
        ananya1.store();
    }
}