package inheritance;

class Animal {
    Animal giveBirth() {
        System.out.println("animal gives birth");
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    Dog giveBirth() {
        System.out.println("dog gives birth");
        return new Dog();
    }
}

public class CovariantReturn {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog a2 = new Dog();
        Animal a3 = new Dog();

        Animal b1 = a1.giveBirth();
        Dog b2 = a2.giveBirth();
        Dog b3 = (Dog) a3.giveBirth();

        System.out.println("b1 type: " + b1.getClass().getSimpleName());
        System.out.println("b2 type: " + b2.getClass().getSimpleName());
        System.out.println("b3 type: " + b3.getClass().getSimpleName());
    }
}
