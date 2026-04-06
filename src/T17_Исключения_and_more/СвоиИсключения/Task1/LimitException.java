package T17_Исключения_and_more.СвоиИсключения.Task1;

public class LimitException extends RuntimeException{
    private final int attempts;

    LimitException(String message, int attempts){
        super(message);
        this.attempts = attempts;
    }

    public int getAttempts() {
        return attempts;
    }
}
