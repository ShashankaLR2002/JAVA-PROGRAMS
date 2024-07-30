public class OuterClass {

    // InnerClass definition inside OuterClass
    class InnerClass {
        public void printMessage() {
            System.out.println("Hello");
        }
    }

    // main method in the outer class
    public static void main(String[] args) {
        // Creating an instance of OuterClass
        OuterClass outer = new OuterClass();
       
        // Creating an instance of InnerClass using the instance of OuterClass
        OuterClass.InnerClass inner = outer.new InnerClass();
       
        // Calling the method in InnerClass
        inner.printMessage();
    }
}
