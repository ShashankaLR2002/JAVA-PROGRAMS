class GanaviRunner 
{
    public static void main(String[] args) 
	{
        Clip clip = new Clip("Red", "Metal");
        Ganavi ganavi = new Ganavi("ganavi@gmail", clip);
        ganavi.print();

        Clip clip1 = new Clip("Green", "steel");
        Ganavi ganavi1 = new Ganavi("ganavi@gmail", clip1);
        ganavi1.print();
    }
}