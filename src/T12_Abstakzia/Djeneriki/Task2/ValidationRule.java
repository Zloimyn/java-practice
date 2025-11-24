package T12_Abstakzia.Djeneriki.Task2;

public class ValidationRule {
    protected final int value;
    private final String errorMessage;

    protected ValidationRule(int value, String errorMessage) {
        this.value = value;
        this.errorMessage = errorMessage;
    }

    public abstract boolean isValid();

    public String getErrorMessage() {
        return errorMessage;
    }
}
