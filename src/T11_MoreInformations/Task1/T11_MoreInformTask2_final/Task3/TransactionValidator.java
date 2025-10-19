package T11_MoreInformations.Task1.T11_MoreInformTask2_final.Task3;

public class TransactionValidator {
    final static int MIN_AMOUNT = 100;
    final static int MAX_AMOUNT = 100_000;
    // объявите константы

    // объявите метод isValidAmount()
    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода
    boolean isValidAmount(int transfer){
        if (MIN_AMOUNT > transfer){
            System.out.println("Минимальная сумма перевода: " +  MIN_AMOUNT + " тг. Попробуйте ещё раз!");
            return false;
        } else if (MAX_AMOUNT < transfer) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " тг. Попробуйте ещё раз!");
            return false;
        }else {
            return true;
        }
    }

}


