class Speaker_1 {
    String brand;
    String size;
    double cost;
    String output;

    Speaker_1(String brand, String size, double cost, String output) {
        this.brand = brand;
        this.size = size;
        this.cost = cost;
        this.output = output;
    }

    void printInstanceVariables() {
        System.out.println("Speaker Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Cost: " + cost);
        System.out.println("Output: " + output);
    }
}






