package T17_Исключения_and_more.Finally.Tfsk1;


public class ValidatePasswordException extends ValidateException {
    public ValidatePasswordException(final String message) throws ValidatePasswordException  {
        super(message);
        throw new ValidatePasswordException("Ошибка валидации пароля: " + message);
    }
}
