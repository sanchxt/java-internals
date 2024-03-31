package exceptions;

public class UncheckedExceptions {
    public static void main(String[] args) {
        String str = null;
        int length = str.length();
    }
}

/*
 * runtime exceptions
 * not checked at compile-time
 * example: NullPointerException, ArrayIndexOutOfBoundsException, NumberFormatException
 */
