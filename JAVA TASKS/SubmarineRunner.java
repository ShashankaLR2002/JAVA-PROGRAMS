class SubmarineRunner 
{
    public static void main(String[] args) 
	{
        
        Plant plant1 = new Plant("Rose", 3, "Red", "Flowering", 2);
        plant1.setClimate("Temperate");
        plant1.setFlowering(true);
        plant1.setSoilType("Loamy");
        plant1.setWaterNeeds(5);
        plant1.setSunlightNeeds(6);

        Plant plant2 = new Plant("Cactus", 2, "Green", "Succulent", 5);
        plant2.setClimate("Arid");
        plant2.setFlowering(false);
        plant2.setSoilType("Sandy");
        plant2.setWaterNeeds(2);
        plant2.setSunlightNeeds(8);

        Plant plant3 = new Plant("Fern", 1, "Green", "Non-flowering", 4);
        plant3.setClimate("Tropical");
        plant3.setFlowering(false);
        plant3.setSoilType("Rich");
        plant3.setWaterNeeds(4);
        plant3.setSunlightNeeds(4);

        Plant[] plants = { plant1, plant2, plant3 };

        for (Plant plant : plants) {
            plant.print();
        }

       
        Ball ball1 = new Ball("Nike", "Red", "Leather", 22, 0.45, true, "Football", "Soccer");
        ball1.setBounceHeight(1.5);
        ball1.setManufacturer("Nike Inc.");
        ball1.setManufacturingYear(2022);
        ball1.setWaterResistant(true);
        ball1.setTexture("Smooth");
        ball1.setPressure(0.6);
        ball1.setDesign("Patterned");
        ball1.setAirRetentionTime(30);

        Ball ball2 = new Ball("Adidas", "White", "Synthetic", 21, 0.42, true, "Basketball", "Basketball");
        ball2.setBounceHeight(1.6);
        ball2.setManufacturer("Adidas AG");
        ball2.setManufacturingYear(2023);
        ball2.setWaterResistant(false);
        ball2.setTexture("Textured");
        ball2.setPressure(0.5);
        ball2.setDesign("Plain");
        ball2.setAirRetentionTime(25);

        Ball ball3 = new Ball("Wilson", "Yellow", "Rubber", 24, 0.5, true, "Volleyball", "Volleyball");
        ball3.setBounceHeight(1.4);
        ball3.setManufacturer("Wilson Sporting Goods");
        ball3.setManufacturingYear(2021);
        ball3.setWaterResistant(true);
        ball3.setTexture("Rough");
        ball3.setPressure(0.55);
        ball3.setDesign("Striped");
        ball3.setAirRetentionTime(28);

        Ball[] balls = { ball1, ball2, ball3 };

        for (Ball ball : balls) {
            ball.print();
        }

       
        Submarine sub1 = new Submarine("USS Seawolf", 108, 9100, 140, "USA");
        sub1.setMaxDepth(600);
        sub1.setSpeed(35);
        sub1.setPropulsionType("Nuclear");
        sub1.setSonarSystem("AN/BQQ-5");
        sub1.setRadarSystem("AN/BPS-16");

        Submarine sub2 = new Submarine("HMS Vanguard", 150, 15900, 135, "UK");
        sub2.setMaxDepth(400);
        sub2.setSpeed(30);
        sub2.setPropulsionType("Nuclear");
        sub2.setSonarSystem("Type 2046");
        sub2.setRadarSystem("Type 2074");

        Submarine sub3 = new Submarine("INS Arihant", 112, 6000, 95, "India");
        sub3.setMaxDepth(300);
        sub3.setSpeed(24);
        sub3.setPropulsionType("Nuclear");
        sub3.setSonarSystem("USHUS");
        sub3.setRadarSystem("BEL");

        Submarine[] submarines = { sub1, sub2, sub3 };

        for (Submarine submarine : submarines) {
            submarine.print();
        }
    }
}
