package T17_Исключения_and_more.Finally.Tfsk1;

public class NameValidator implements Validator {
    @Override
    public void validate(String value) throws ValidateException {
        if (value == null || value.isEmpty()) {
            throw new ValidateException(
                    String.format("Имя не должно быть пустым", value)
            );
        }
    }
    // допишите код класса
}
