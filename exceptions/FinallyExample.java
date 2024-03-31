package exceptions;

public class FinallyExample {
    static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("error: " + e.getMessage());
        } finally {
            System.out.println("finally block ran");
        }
    }
}
