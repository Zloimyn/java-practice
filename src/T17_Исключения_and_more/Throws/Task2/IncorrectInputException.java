package T17_Исключения_and_more.Throws.Task2;

public class IncorrectInputException extends Exception {
    public IncorrectInputException(String message) {
        super(message);
    }
}
