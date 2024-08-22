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
