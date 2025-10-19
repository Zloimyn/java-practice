package T11_MoreInformations.Task1.T11_MoreInformTask2_final.Task3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TransactionValidator transactionValidator = new TransactionValidator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите сумму перевода в тенге.");
        // считайте сумму перевода
        int amount = scanner.nextInt();
        boolean isValid = transactionValidator.isValidAmount(amount); // добавьте вызов метод isValidAmount
        if (isValid)
            System.out.println("Спасибо! Ваш перевод на сумму " + amount + " тг. успешно выполнен.");
    }
}
