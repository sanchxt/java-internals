package classes;

public class ConstructorsExample {
    private String brand, model;
    private int year;

    public ConstructorsExample() {
        brand = "NA";
        model = "NA";
        year = 0;
    }

    public ConstructorsExample(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("year: " + year);
    }

    public static void main(String[] args) {
        ConstructorsExample car1 = new ConstructorsExample();
        ConstructorsExample car2 = new ConstructorsExample("Hyundai", "i10", 2024);

        System.out.println("car 1 -");
        car1.display();

        System.out.println("\ncar 2 -");
        car2.display();
    }
}
