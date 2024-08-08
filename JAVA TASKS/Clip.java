class Clip 

{
    String color;
    String type;

    public Clip(String color, String type)
	{
        this.color = color;
        this.type = type;
    }

    public void print() 
	{
        System.out.println("color: " + this.color);
        System.out.println("type: " + this.type);
    }
}