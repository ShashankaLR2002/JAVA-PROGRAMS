// ClassWithStackOverflow.java
public class ClassWithStackOverflow {
    public static void method1() {
        System.out.println("Method 1 calling Method 2");
        method2();
    }

    public static void method2() {
        System.out.println("Method 2 calling Method 1");
        method1();
    }

}
