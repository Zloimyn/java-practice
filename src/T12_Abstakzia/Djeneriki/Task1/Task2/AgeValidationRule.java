package T12_Abstakzia.Djeneriki.Task1.Task2;

public class AgeValidationRule extends ValidationRule<Byte> {
    public AgeValidationRule(Byte age) {
        super(age, "Возраст для подачи на ипотеку должен быть старше 18 лет");
    }

    @Override
    public boolean isValid() {
        return value >= 18;
    }

    public String getErrorMessage() {
        return "Ваш возраст меньше 18";
    }
}
