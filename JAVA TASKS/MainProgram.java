 class MainProgram 
 {
    public static void main(String[] args) {
       
        Owner owner = new Owner("John Doe", 45, "Male");
        Hotel hotel = new Hotel("Sunset Inn", owner);
        
        SoftwareEngineer engineer = new SoftwareEngineer("Alice Smith", 5, "Senior Developer", 90000);
        Company company = new Company(1, "Tech Solutions", "San Francisco", engineer);
        
        CapitalCity capitalCity = new CapitalCity("Metropolis", 1000000);
        State state = new State("California", "English", capitalCity);
        
        Country country = new Country("USA", "North America", state);
        
        owner.printDetails();
        
        hotel.printDetails();
        
        engineer.printDetails();
      
        company.printDetails();
        
        capitalCity.printDetails();
       
        state.printDetails();
    
        country.printDetails();
    }
}