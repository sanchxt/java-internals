public class LiteralsExamples {
    public static void main(String[] args) {
        // integer literals
        int decimalInt = 123;
        int octalInt = 077; // 63
        int hexInt = 0xABCD; // 43981
        int binaryInt = 0b1010; // 10

        // decimal literals
        double decimalDouble = 3.14;
        double scientificDouble = 6.022e23;

        // char literals
        char charLiteral = 'A';
        char digitChar = '9';
        char specialChar = '%';
        char newlineChar = '\n'; // new line
        char unicodeChar = '\u0041'; // unicode 'A'

        // String literals
        String helloString = "Hello";
        String javaString = "Java";
        String numberString = "123";
        String specialString = "Special characters: \t \n";

        // Boolean literals
        boolean trueBoolean = true;
        boolean falseBoolean = false;

        // Null literal
        Object nullObject = null;

        System.out.println("Integer Literals:");
        System.out.println("Decimal: " + decimalInt);
        System.out.println("Octal: " + octalInt);
        System.out.println("Hexadecimal: " + hexInt);
        System.out.println("Binary: " + binaryInt);

        System.out.println("\nFloating-Point Literals:");
        System.out.println("Decimal: " + decimalDouble);
        System.out.println("Scientific: " + scientificDouble);

        System.out.println("\nCharacter Literals:");
        System.out.println("Character: " + charLiteral);
        System.out.println("Digit Character: " + digitChar);
        System.out.println("Special Character: " + specialChar);
        System.out.println("Newline Character: " + newlineChar);
        System.out.println("Unicode Character: " + unicodeChar);

        System.out.println("\nString Literals:");
        System.out.println("String: " + helloString);
        System.out.println("String: " + javaString);
        System.out.println("String: " + numberString);
        System.out.println("String: " + specialString);

        System.out.println("\nBoolean Literals:");
        System.out.println("Boolean: " + trueBoolean);
        System.out.println("Boolean: " + falseBoolean);

        System.out.println("\nNull Literal:");
        System.out.println("Null Object: " + nullObject);
    }
}
