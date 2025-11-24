package T12_Abstakzia.Djeneriki.Task2;

public class EmploymentValidationRule {
    public EmploymentValidationRule(Boolean value) {
        super(value, "Ипотека выдается только трудоустроенным");
    }

    @Override
    public boolean isValid() {
        return value;
    }

    public String getErrorMessage() {
        System.out.println("Вы не трудоустроены");
    }
}
