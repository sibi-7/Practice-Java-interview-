//Custom Exceptions
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom error occurred!");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
