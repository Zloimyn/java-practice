package T17_Исключения_and_more.Finally.Tfsk1;

public class NameValidator implements Validator {
    @Override
    public void validate(String value) throws ValidateException {
        System.out.println("Имя не должно быть пустым");
    }
    // допишите код класса
}
