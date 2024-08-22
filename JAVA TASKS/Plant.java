class Plant 
{
    private String species;
    private int height;
    private String color;
    private String type;
    private int age;

    private String climate;
    private boolean isFlowering;
    private String soilType;
    private int waterNeeds;
    private int sunlightNeeds;

    public Plant(String species, int height, String color, String type, int age) 
	{
        this.species = species;
        this.height = height;
        this.color = color;
        this.type = type;
        this.age = age;
    }

    public void setClimate(String climate)
	{
        this.climate = climate;
    }

    public void setFlowering(boolean isFlowering) 
	{
        this.isFlowering = isFlowering;
    }

    public void setSoilType(String soilType) 
	{
        this.soilType = soilType;
    }

    public void setWaterNeeds(int waterNeeds) 
	{
        this.waterNeeds = waterNeeds;
    }

    public void setSunlightNeeds(int sunlightNeeds) 
	{
        this.sunlightNeeds = sunlightNeeds;
    }

    public void print() 
	{
        System.out.println("Plant Species: " + species);
        System.out.println("Height: " + height);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
        System.out.println("Climate: " + climate);
        System.out.println("Flowering: " + isFlowering);
        System.out.println("Soil Type: " + soilType);
        System.out.println("Water Needs: " + waterNeeds);
        System.out.println("Sunlight Needs: " + sunlightNeeds);
    }
}