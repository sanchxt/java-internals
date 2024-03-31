package exceptions;

public class ExceptionClass {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
