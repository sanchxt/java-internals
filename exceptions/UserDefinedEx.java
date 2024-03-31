package exceptions;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class Voter {
    public void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("age must be 18+");
        } else {
            System.out.println("eligible to vote");
        }
    }
}

public class UserDefinedEx {
    public static void main(String[] args) {
        Voter voter = new Voter();
        try {
            voter.checkEligibility(17);
        } catch (InvalidAgeException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
