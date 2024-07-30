public class Bus {
    public static void mirror() {
        System.out.println("Front");
        horn();
    }

    public static void horn() {
        System.out.println("Rear");
        mirror();
    }

    public static void main(String[] args) {
        mirror();
    }
	}	 