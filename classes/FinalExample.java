package classes;

public class FinalExample {
    static final int MAX_SIZE = 100;
    final int instanceVar;

    public FinalExample(int value) {
        // Assigning value to final instance variable in constructor
        this.instanceVar = value;
    }

    public final void finalMethod() {
        System.out.println("Final method called");
    }

    public static void main(String[] args) {
        System.out.println("Max size: " + FinalExample.MAX_SIZE);

        FinalExample obj = new FinalExample(10);

        System.out.println("Instance variable: " + obj.instanceVar);
        obj.finalMethod();
    }
}
