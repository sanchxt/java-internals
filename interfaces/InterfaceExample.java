package interfaces;

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("dog barks");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("cat meows");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
    }
}
