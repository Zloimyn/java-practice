package T12_Abstakzia.Djeneriki.Task2;

public class MortgageAmountValidationRule {
    public MortgageAmountValidationRule(Integer value) {
        super(value, "Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
    }

    // Объявите и реализуйте метод для проверки суммы ипотеки ниже
    public boolean isValid (Integer value){
        if (value >= 1_000_000 || value <= 10_000_000){
            return true;
        }else {
            return false;
        }
    }

    public String getErrorMessage() {
        return "Ваша сумма не подходит";
    }
}
