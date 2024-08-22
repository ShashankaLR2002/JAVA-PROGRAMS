 class Hotel 
 {
    String name;
    Owner owner;

    public Hotel(String name, Owner owner) {
        this.name = name;
        this.owner = owner;
    }

    public void printDetails() {
        System.out.println("Hotel Details:");
        System.out.println("Name: " + name);
        System.out.print("Owner: ");
        owner.printDetails();
    }
}