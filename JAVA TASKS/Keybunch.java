class Keybunch
{
    String material;
    Key key;

    public Keybunch(String material, Key key) 
	{
        this.material = material;
        this.key = key;
    }

    public void display() 
	{
        System.out.println("material: " + this.material);
        System.out.print("key: ");
        key.display();
    }
}