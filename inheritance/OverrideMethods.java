package inheritance;

class Animal {
    void sound() {
        System.out.println("animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("animal barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("animal meows");
    }
}

public class OverrideMethods {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog a2 = new Dog();
        Cat a3 = new Cat();

        a1.sound();
        a2.sound();
        a3.sound();
    }
}
