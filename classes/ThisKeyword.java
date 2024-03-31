package classes;

public class ThisKeyword {
    private String name;
    private int age;

    public ThisKeyword(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
    }

    public boolean isOlder(ThisKeyword other) {
        return this.age > other.age;
    }

    public static void main(String[] args) {
        ThisKeyword p1 = new ThisKeyword("Pedo", 19);
        ThisKeyword p2 = new ThisKeyword("Minor", 12);

        System.out.println("person 1:");
        p1.display();

        System.out.println("person 2:");
        p2.display();

        if (p1.isOlder(p2)) {
            System.out.println("\n" + p1.name + " is older");
        } else {
            System.out.println("\n" + p2.name + " is older");
        }
    }
}
