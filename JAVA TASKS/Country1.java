class Country1 {
    public static void states(String[] states_1) {
        for (int run = states_1.length - 1; run >= 0; run--) {
            String ref = states_1[run];
            System.out.println("State: " + ref);
        }
    }

    public static void pincode(int[] pin_code) {
        for (int pin = pin_code.length - 1; pin >= 0; pin--) {
            int ref = pin_code[pin];
            System.out.println("Pincode: " + ref);
        }
    }

    public static void politicalParties(String[] political_Parties) {
        for (int political = political_Parties.length - 1; political >= 0; political--) {
            String ref = political_Parties[political];
            System.out.println("Political Party: " + ref);
        }
    }

    public static void primeministers(String[] prime_ministers) {
        for (int prime = prime_ministers.length - 1; prime >= 0; prime--) {
            String ref = prime_ministers[prime];
            System.out.println("Prime Minister: " + ref);
        }
    }

    public static void cabinetMinisters(String[] cabinet_ministers) {
        for (int cabinet = cabinet_ministers.length - 1; cabinet >= 0; cabinet--) {
            String ref = cabinet_ministers[cabinet];
            System.out.println("Cabinet Minister: " + ref);
        }
    }
}