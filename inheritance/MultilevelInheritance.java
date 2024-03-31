package inheritance;

class Animal {
    void eat() {
        System.out.println("animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("dog barks");
    }
}

class Labrador extends Dog {
    void color() {
        System.out.println("labrador is black");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Labrador lab = new Labrador();
        lab.eat();
        lab.bark();
        lab.color();
    }
}
