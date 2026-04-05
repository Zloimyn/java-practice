package T17_Исключения_and_more.СвоиИсключения.Task1;

public class InputException extends Exception {
    private final int inputValue;

    public InputException(final String message, final int inputValue) {
        super(message);
        this.inputValue = inputValue;
    }

    public String getDetailMessage() {
        return getMessage() + " = " + inputValue;
    }

    public String notaNumber(){
        try {
            return null;
        }catch (NumberFormatException e){
            return e.getMessage();
        }
    }

    public String numberIsNormal(){
        if (inputValue < 0){
            return "Введено отрицательное значение";
        }
        return getMessage();
    }
    public String problemInput(){
        return getDetailMessage();
    }

}

