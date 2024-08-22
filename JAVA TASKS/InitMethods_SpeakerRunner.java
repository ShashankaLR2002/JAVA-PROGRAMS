 class Speaker {
    public static void main(String[] args) {
        Speaker speaker1 = new Speaker("Sony", "Medium", 150.00, "Stereo");
        Speaker speaker2 = new Speaker("Bose", "Large", 300.00, "Surround");
        Speaker speaker3 = new Speaker("JBL", "Small", 100.00, "Mono");
		
		speaker1.printInstanceVariables();
        speaker2.printInstanceVariables();
        speaker3.printInstanceVariables();

        Rocket rocket1 = new Rocket("USA", 50000, 200000, 5);
        Rocket rocket2 = new Rocket("Russia", 55000, 220000, 6);
        Rocket rocket3 = new Rocket("China", 60000, 250000, 7);
		
        rocket1.printInstanceVariables();
        rocket2.printInstanceVariables();
        rocket3.printInstanceVariables();

        Chocolate chocolate1 = new Chocolate("Cadbury", 2.50, "Milk", "Medium");
        Chocolate chocolate2 = new Chocolate("Lindt", 3.00, "Dark", "Small");
        Chocolate chocolate3 = new Chocolate("Ghirardelli", 4.00, "Caramel", "Large");
		
		chocolate1.printInstanceVariables();
        chocolate2.printInstanceVariables();
        chocolate3.printInstanceVariables();
        
        Projector projector1 = new Projector("Epson", "LCD", "White", 2.5);
        Projector projector2 = new Projector("BenQ", "DLP", "Black", 3.0);
        Projector projector3 = new Projector("Sony", "LCoS", "Silver", 3.2);
		
		projector1.printInstanceVariables();
        projector2.printInstanceVariables();
        projector3.printInstanceVariables();

        Paper paper1 = new Paper(0.1, "A4", "High", "White");
        Paper paper2 = new Paper(0.2, "A3", "Medium", "Cream");
        Paper paper3 = new Paper(0.15, "Letter", "Low", "Yellow");
 
        paper1.printInstanceVariables();
        paper2.printInstanceVariables();
        paper3.printInstanceVariables();
    }
}
