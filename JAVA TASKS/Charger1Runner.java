 class Charger1Runner {
    public static void main(String[] args) {
        Charger charger = new Charger();
        charger.name = "iphone";
        charger.colour = "white";
        System.out.println("Charger cost: " + charger.cost);
        System.out.println("Charger name: " + charger.name);
        System.out.println("Charger colour: " + charger.colour);

        Crow crow = new Crow();
        crow.noofcrow = 1;
        crow.name = "American Crow";
        System.out.println("Crow noofcrow: " + crow.noofcrow);
        System.out.println("Crow name: " + crow.name);
        System.out.println("Crow colour: " + crow.colour);

        Jean jean = new Jean();
        jean.colour = "blue";
        jean.brand = "levies";
        System.out.println("Jean cost: " + jean.cost);
        System.out.println("Jean brand: " + jean.brand);
        System.out.println("Jean colour: " + jean.colour);

        Clock clock = new Clock();
        clock.cost = 3000;
        clock.quantity = 4;
        System.out.println("Clock cost: " + clock.cost);
        System.out.println("Clock company: " + clock.company);
        System.out.println("Clock quantity: " + clock.quantity);

        Lolipop lolipop = new Lolipop();
        lolipop.cost = 10;
        lolipop.company = "chupa chups";
        System.out.println("Lolipop cost: " + lolipop.cost);
        System.out.println("Lolipop company: " + lolipop.company);
        System.out.println("Lolipop flavour: " + lolipop.flavour);

        Claw claw = new Claw();
        claw.type = "Retractable";
        claw.sharpness = true;
        System.out.println("Claw type: " + claw.type);
        System.out.println("Claw sharpness: " + claw.sharpness);
        System.out.println("Claw length: " + claw.length);

        Keyboard keyboard = new Keyboard();
        keyboard.cost = 10;
        System.out.println("Keyboard cost: " + keyboard.cost);
        System.out.println("Keyboard company: " + keyboard.company);
        System.out.println("Keyboard quantity: " + keyboard.quantity);

        Mountain mountain = new Mountain();
        mountain.name = "Baba Budangiri";
        mountain.location = "chikkamagaluru";
        System.out.println("Mountain name: " + mountain.name);
        System.out.println("Mountain location: " + mountain.location);
        System.out.println("Mountain height: " + mountain.height);

        Stadium stadium = new Stadium();
        stadium.name = "Chinnaswamy Stadium";
        stadium.location = "bengaluru";
        System.out.println("Stadium name: " + stadium.name);
        System.out.println("Stadium location: " + stadium.location);
        System.out.println("Stadium capacity: " + stadium.capacity);

        Spray spray = new Spray();
        spray.name = "fogg";
        spray.type = "bodyspray";
        System.out.println("Spray name: " + spray.name);
        System.out.println("Spray type: " + spray.type);
        System.out.println("Spray cost: " + spray.cost);
    }
}
