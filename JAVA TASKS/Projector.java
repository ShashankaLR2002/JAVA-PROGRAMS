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