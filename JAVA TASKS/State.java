class State 
{
     String name;
     String language;
     CapitalCity capitalCity;

    public State(String name, String language, CapitalCity capitalCity) {
        this.name = name;
        this.language = language;
        this.capitalCity = capitalCity;
    }

    public void printDetails() {
        System.out.println("State Details:");
        System.out.println("Name: " + name);
        System.out.println("Language: " + language);
        System.out.print("Capital City: ");
        capitalCity.printDetails();
    }
}
