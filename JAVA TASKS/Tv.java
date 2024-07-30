//1)Declare a class , and declare 10 static methods and invoke from main method in another class 
//2) Declare a class, write 5 static methods and link methods, invoke one method from main Method
class Tv
{
    public static void Remote()
{
        System.out.println("Keys");
        Reciever();
    }

    public static void Reciever()
{
        System.out.println("Circuit");
        Stabilizer();
    }

    public static void Stabilizer()
{
        System.out.println("Regulator");
        Dish();
    }							

    public static void Dish()
{
        System.out.println("Recieving");
      Usb();
    }

    public static void Usb()
{
        System.out.println("Files");
    Satellite();
	}

    public static void Satellite()
{
        System.out.println("Trasnmission");
    Display();
	}

    public static void Display()
{
        System.out.println("screen");
        joystick();
    }

    public static void  joystick()
{
        System.out.println("Games");
        Speaker();
    }

    public static void Speaker()
{
        System.out.println("Sound");
    }
}
