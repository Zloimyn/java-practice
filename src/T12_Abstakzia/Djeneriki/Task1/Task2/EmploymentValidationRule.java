package T12_Abstakzia.Djeneriki.Task1.Task2;

public class EmploymentValidationRule extends ValidationRule<Boolean>{
    public EmploymentValidationRule(Boolean value) {
        super(value, "Ипотека выдается только трудоустроенным");
    }

    @Override
    public boolean isValid() {
        return value;
    }

    public String getErrorMessage() {
        return "Вы не трудоустроены";
    }
}
