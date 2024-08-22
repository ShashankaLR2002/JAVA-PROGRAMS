class Speaker {
    String brand;
    String size;
    double cost;
    String output;

    Speaker(String brand, String size, double cost, String output) {
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

class Rocket {
    String country;
    double speed;
    double fuelCapacity;
    int noOfThrusters;

    Rocket(String country, double speed, double fuelCapacity, int noOfThrusters) {
        this.country = country;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.noOfThrusters = noOfThrusters;
    }

    void printInstanceVariables() {
        System.out.println("Rocket Details:");
        System.out.println("Country: " + country);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Capacity: " + fuelCapacity);
        System.out.println("Number of Thrusters: " + noOfThrusters);
    }
}

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

class Projector {
    String company;
    String type;
    String color;
    double weight;

    Projector(String company, String type, String color, double weight) {
        this.company = company;
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    void printInstanceVariables() {
        System.out.println("Projector Details:");
        System.out.println("Company: " + company);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
}

class Paper {
    double thickness;
    String size;
    String quality;
    String color;

    Paper(double thickness, String size, String quality, String color) {
        this.thickness = thickness;
        this.size = size;
        this.quality = quality;
        this.color = color;
    }

    void printInstanceVariables() {
        System.out.println("Paper Details:");
        System.out.println("Thickness: " + thickness);
        System.out.println("Size: " + size);
        System.out.println("Quality: " + quality);
        System.out.println("Color: " + color);
    }
}
