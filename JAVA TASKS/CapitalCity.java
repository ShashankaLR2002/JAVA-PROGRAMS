class CapitalCity 
{
    String name;
    int population;

    public CapitalCity(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public void printDetails() {
        System.out.println("Capital City Details:");
        System.out.println("Name: " + name);
        System.out.println("Population: " + population);
    }
}