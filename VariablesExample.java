public class VariablesExample {
    static int classVar = 10; // class variable (static)

    int instanceVar = 20; // instance variable (non-static)

    public void method() {
        int localVar = 30;

        System.out.println("class variable: " + classVar);
        System.out.println("instance variable: " + instanceVar);
        System.out.println("local variable: " + localVar);
    }

    public static void main(String[] args) {
        VariablesExample obj = new VariablesExample();

        System.out.println("instance variable (thru object): " + obj.instanceVar);
        System.out.println("Class variable (direct): " + classVar);
        obj.method();
    }
}
