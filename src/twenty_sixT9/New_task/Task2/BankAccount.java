package twenty_sixT9.New_task.Task2;

public class BankAccount {
    private double balance;

    double getBalance(){
        return balance;
    }

    void deposit(double amount){
        if (amount < 1){
            System.out.println("Нельзя пополнять на 0");
        }else {
            balance+=amount;
        }
    }
    void withdraw(double amount){
        if (amount < balance){
            balance-=amount;
        }else {
            System.out.println("Нельзя снять больше чем есть");
        }
    }
}
