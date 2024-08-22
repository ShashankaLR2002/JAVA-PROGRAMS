class Chocolate {
    String brand;
    double price;
    String flavour;
    String size;

    Chocolate(String brand, double price, String flavour, String size) {
        this.brand = brand;
        this.price = price;
        this.flavour = flavour;
        this.size = size;
    }

    void printInstanceVariables() {
        System.out.println("Chocolate Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Flavour: " + flavour);
        System.out.println("Size: " + size);
    }
}
