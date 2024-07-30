class InfoProvider1{
    
    public static String medicinePrice(String medicineName)
	{
        System.out.println("Medicine Name = " + medicineName);
        if (medicineName == "Paracetamol") 
		{
        return "10";
        } else if (medicineName == "Aspirin") 
		{
        return "8";
        } else if (medicineName == "Ibuprofen")
		{
        return "12";
        } else 
		{
        return "Price Not Found";
        }
    }
    
     public static String medicineForSymptom(String symptom) {
        System.out.println("Symptom = " + symptom);
        if (symptom == "Headache") {
        return "Aspirin";
        } else if (symptom == "Fever") 
		{
        return "Paracetamol";
        } else if (symptom == "Inflammation") 
		{
        return "Ibuprofen";
        } else {
        return "Medicine Not Found";
        }
    }
    
    public static String availabilityForDoctor(String doctorName) {
        System.out.println("Doctor Name = " + doctorName);
        if (doctorName == "Dr. Smith")
		{
        return "Available";
        } 
		else if (doctorName == "Dr. Johnson") 
		{
        return "Not Available";
        } 
		else if (doctorName == "Dr. Brown") 
		{
        return "Available";
        } 
		else 
		{
        return "Availability Unknown";
        }
    }
}
