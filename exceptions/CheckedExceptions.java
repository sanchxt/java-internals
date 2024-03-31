package exceptions;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("file not found: " + e.getMessage());
        }
    }
}

/*
 * checked exceptions are checked at compile time
 * examples: IOException, FileNotFoundException, ParseException
 */
