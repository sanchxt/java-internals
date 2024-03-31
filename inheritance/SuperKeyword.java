package inheritance;

class Animal {
    String color = "brown";

    void eat() {
        System.out.println("animal eats");
    }
}

class Dog extends Animal {
    String color = "black";

    void eat() {
        System.out.println("animal eats a lot (animal is fat af)");
    }

    void display() {
        System.out.println("superclass color: " + super.color);
        eat();
        super.eat();
        System.out.println("subclass color: " + color);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}
