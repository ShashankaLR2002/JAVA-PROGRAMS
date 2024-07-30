public class Bed {
     public static void main(String[] args) {
  
    }


   public static void Pillow();{
        System.out.println("pillow calling bedsheet");
       Bedsheet();
    }

    public static void Bedsheet(); {
        System.out.println("bedsheet calling pillow");
    Pillow();
    }

  
}
