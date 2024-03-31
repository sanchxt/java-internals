package classes;

public class BasicClass {
    private String name;
    private int age;
    private double grade;

    public BasicClass(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setName(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void display() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("grade: " + grade);
    }

    public static void main(String[] args) {
        BasicClass s1 = new BasicClass("sanchit", 21, 92.7);

        System.out.println("student info:");
        s1.display();

        s1.setGrade(95.9);
        System.out.println("\nnew info:");
        s1.display();
    }
}
