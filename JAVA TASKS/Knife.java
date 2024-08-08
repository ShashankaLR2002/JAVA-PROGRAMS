class Knife 
{
    double weight;
    double height;

    public Knife(double weight, double height) 
	{
        this.weight = weight;
        this.height = height;
    }

    public void store()
	{
        System.out.println("weight: " + this.weight);
        System.out.println("height: " + this.height);
    }
}