package classes;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "sanchit";
        String str2 = "bhalla";

        String str3 = new String("kanye");

        int length = str1.length();
        System.out.println("length of str1: " + length);

        String concatStr = str3.concat(" west");
        System.out.println("concatenated string: " + concatStr);

        boolean containsSubstring = str1.contains("san");
        System.out.println("str1 contains san: " + containsSubstring);

        String subStr = str1.substring(0, 3); // from index 0 to index 2
        String subStr2 = str1.substring(3); // from index 3
        System.out.println("first substring: " + subStr);
        System.out.println("second substring: " + subStr2);

        String upperCaseStr = str1.toUpperCase();
        String lowerCaseStr = upperCaseStr.toLowerCase();
        System.out.println("upper case: " + upperCaseStr);
        System.out.println("lower case: " + lowerCaseStr);

        String[] parts = str2.split("");
        System.out.println("\nparts of str2:");
        for (String part : parts) {
            System.out.println(part);
        }

        String str4 = "hello"; // if this was Hello and str5 was hello, it would return -32 instead of 32
        String str5 = "Hello";
        int compareResult = str4.compareTo(str5);
        System.out.println("comparison: " + compareResult); // returns 32 (diff in ASCII value)

        boolean isEqual = str4.equals(str5);
        System.out.println("str4 equals str5: " + isEqual);

        boolean isEqualIgnoreCase = str4.equalsIgnoreCase(str5);
        System.out.println("str4 equals str5 (ignoring the case): " + isEqualIgnoreCase);
    }
}
