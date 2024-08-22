class SoftwareEngineer 
{
     String name;
     int experience;
     String designation;
     double salary;

    public SoftwareEngineer(String name, int experience, String designation, double salary) {
        this.name = name;
        this.experience = experience;
        this.designation = designation;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Software Engineer Details:");
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Designation: " + designation);
        System.out.println("Salary: $" + salary);
    }
}