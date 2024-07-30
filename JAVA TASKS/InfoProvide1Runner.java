class InfoProvider1Runner {
    public static void main(String[] args) {
       
        String price1 = InfoProvider1.medicinePrice("Paracetamol");
        System.out.println("Price for Paracetamol = " + price1);
        
        String price2 = InfoProvider1.medicinePrice("Aspirin");
        System.out.println("Price for Aspirin = " + price2);
        
        String price3 = InfoProvider1.medicinePrice("Ibuprofen");
        System.out.println("Price for Ibuprofen = " + price3);
        
        String price4 = InfoProvider1.medicinePrice("Penicillin");
        System.out.println("Price for Penicillin = " + price4);
       
        String medicine1 = InfoProvider1.medicineForSymptom("Headache");
        System.out.println("Medicine for Headache = " + medicine1);
        
        String medicine2 = InfoProvider1.medicineForSymptom("Fever");
        System.out.println("Medicine for Fever = " + medicine2);
        
        String medicine3 = InfoProvider1.medicineForSymptom("Inflammation");
        System.out.println("Medicine for Inflammation = " + medicine3);
        
        String medicine4 = InfoProvider1.medicineForSymptom("Cough");
        System.out.println("Medicine for Cough = " + medicine4);
        
        String availability1 = InfoProvider1.availabilityForDoctor("Dr. Smith");
        System.out.println("Availability of Dr. Smith = " + availability1);
        
        String availability2 = InfoProvider1.availabilityForDoctor("Dr. Johnson");
        System.out.println("Availability of Dr. Johnson = " + availability2);
        
        String availability3 = InfoProvider1.availabilityForDoctor("Dr. Brown");
        System.out.println("Availability of Dr. Brown = " + availability3);
        
        String availability4 = InfoProvider1.availabilityForDoctor("Dr. White");
        System.out.println("Availability of Dr. White = " + availability4);
    }
}
