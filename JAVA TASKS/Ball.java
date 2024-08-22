class Ball 
{
    private String brand;
    private String color;
    private String material;
    private int diameter;
    private double weight;
    private boolean isInflated;
    private String type;
    private String sport;

    private double bounceHeight;
    private String manufacturer;
    private int manufacturingYear;
    private boolean isWaterResistant;
    private String texture;
    private double pressure;
    private String design;
    private int airRetentionTime;
    private boolean isOfficialSize;
    private String logo;
    private String countryOfOrigin;
    private String packingType;
    private int durabilityRating;
    private String approvedBy;
    private double circumference;
    private boolean isSuitableForOutdoor;
    private String stitchingType;
    private boolean isForProfessionalUse;

    public Ball(String brand, String color, String material, int diameter, double weight, boolean isInflated, String type, String sport) 
	{
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.diameter = diameter;
        this.weight = weight;
        this.isInflated = isInflated;
        this.type = type;
        this.sport = sport;
    }

    public void setBounceHeight(double bounceHeight)
	{
        this.bounceHeight = bounceHeight;
    }

    public void setManufacturer(String manufacturer) 
	{
        this.manufacturer = manufacturer;
    }

    public void setManufacturingYear(int manufacturingYear) 
	{
        this.manufacturingYear = manufacturingYear;
    }

    public void setWaterResistant(boolean isWaterResistant) 
	{
        this.isWaterResistant = isWaterResistant;
    }

    public void setTexture(String texture) 
	
	{
        this.texture = texture;
    }

    public void setPressure(double pressure) 
	{
        this.pressure = pressure;
    }

    public void setDesign(String design) 
	{
        this.design = design;
    }

    public void setAirRetentionTime(int airRetentionTime) 
	{
        this.airRetentionTime = airRetentionTime;
    }

    public void setOfficialSize(boolean isOfficialSize) 
	{
        this.isOfficialSize = isOfficialSize;
    }

    public void setLogo(String logo)
	{
        this.logo = logo;
    }

    public void setCountryOfOrigin(String countryOfOrigin)

	{
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setPackingType(String packingType) 
	{
        this.packingType = packingType;
    }

    public void setDurabilityRating(int durabilityRating) 
	{
        this.durabilityRating = durabilityRating;
    }

    public void setApprovedBy(String approvedBy) 
	{
        this.approvedBy = approvedBy;
    }

    public void setCircumference(double circumference) 
	{
        this.circumference = circumference;
    }

    public void setSuitableForOutdoor(boolean isSuitableForOutdoor) 
	{
        this.isSuitableForOutdoor = isSuitableForOutdoor;
    }

    public void setStitchingType(String stitchingType) 
	{
        this.stitchingType = stitchingType;
    }

    public void setForProfessionalUse(boolean isForProfessionalUse) 
	{
        this.isForProfessionalUse = isForProfessionalUse;
    }

    public void print()
	{
        System.out.println("Ball Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Diameter: " + diameter);
        System.out.println("Weight: " + weight);
        System.out.println("Is Inflated: " + isInflated);
        System.out.println("Type: " + type);
        System.out.println("Sport: " + sport);
        System.out.println("Bounce Height: " + bounceHeight);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Water Resistant: " + isWaterResistant);
        System.out.println("Texture: " + texture);
        System.out.println("Pressure: " + pressure);
        System.out.println("Design: " + design);
        System.out.println("Air Retention Time: " + airRetentionTime);
        System.out.println("Official Size: " + isOfficialSize);
        System.out.println("Logo: " + logo);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Packing Type: " + packingType);
        System.out.println("Durability Rating: " + durabilityRating);
        System.out.println("Approved By: " + approvedBy);
        System.out.println("Circumference: " + circumference);
        System.out.println("Suitable For Outdoor: " + isSuitableForOutdoor);
        System.out.println("Stitching Type: " + stitchingType);
        System.out.println("For Professional Use: " + isForProfessionalUse);
    }
}
