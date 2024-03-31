import shapes.Circle;
import shapes.Rectangle;
// import shapes.*; (as a shorthand)

public class ImportingPackages {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 7);

        System.out.println("circle area: " + c.getArea());
        System.out.println("rectangle area: " + r.getArea());
    }
}
