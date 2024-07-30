 //Declare a class, write Two static methods and main method also in same class. Invoke non-main methods from main method
class Satellite{

    public static void Transmitter() {
        System.out.println("Signal pass");
        Reciever();
    }

    public static void Reciever() {
        System.out.println("Signal Recieve");
    }

    public static void main(String[] args) {
        System.out.println("Antenna");
        Speaker.sound();
		Transmitter();
    }
}