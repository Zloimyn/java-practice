package T12_Abstakzia.Djeneriki.Task1.Task2;

public class MortgageAmountValidationRule extends ValidationRule<Integer>{
    public MortgageAmountValidationRule(Integer value) {
        super(value, "Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
    }

    // Объявите и реализуйте метод для проверки суммы ипотеки ниже
    @Override
    public boolean isValid (){
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
