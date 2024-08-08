public class KeybunchRunner 
{
    public static void main(String[] args) 
	{
        System.out.println("running main in KeybunchRunner");
        Key key = new Key(2.3, "Miniso");
        Keybunch keybunch = new Keybunch("Metal", key);
        keybunch.display();

        Key key1 = new Key(3.3, "Highlark");
        Keybunch keybunch1 = new Keybunch("Steel", key1);
        keybunch1.display();
    }
}