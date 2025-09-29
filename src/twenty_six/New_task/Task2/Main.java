package twenty_six.New_task.Task2;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(1000);
        System.out.println("Баланс: " + account.getBalance());

        account.withdraw(500);
        System.out.println("Баланс: " + account.getBalance());

        account.withdraw(700);
    }
}
