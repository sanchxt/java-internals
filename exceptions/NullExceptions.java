package exceptions;

public class NullExceptions {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
