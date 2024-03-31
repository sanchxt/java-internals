package inheritance;

abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("animal sleeps");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("dog barks");
    }
    
}

class Cat extends Animal {
    void sound() {
        System.out.println("cat meows");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        dog.sleep();

        cat.sound();
        cat.sleep();
    }
}
