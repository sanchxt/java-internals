package classes;

public class StaticExample {
    static int staticVar = 10; // static variable
    int instanceVar;

    // static block
    static {
        System.out.println("static block initialized");
        staticVar = 20;
    }

    // static method
    static void staticMethod() {
        System.out.println("static method called");
        System.out.println("value of static variable: " + staticVar);
    }

    void instanceMethod() {
        System.out.println("Instance method called");
        System.out.println("Value of instanceVariable: " + instanceVar);
    }

    public static void main(String[] args) {
        StaticExample.staticMethod();

        StaticExample obj = new StaticExample();
        obj.instanceMethod();

        System.out.println("Value of staticVar: " + staticVar);
        
        StaticExample.staticVar = 69;
        System.out.println("\nnew value of staticVar: " + staticVar);
    }
}
