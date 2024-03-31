package exceptions;

public class OutOfBoundsEx {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            int value = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}

// more such exceptions:
/*
 * NumberFormatException (trying to parse a string to a number, but the string doesn't have the appropriate format, for e.g., string is "abc" instead of "123")
 * FileNotFoundException (when accessing a file that doesn't exist)
 * IOException (any I/O related exception)
*/
