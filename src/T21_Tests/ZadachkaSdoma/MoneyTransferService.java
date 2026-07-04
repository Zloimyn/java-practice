package T21_Tests.ZadachkaSdoma;

public class MoneyTransferService {
    public void transfer(int amount, Account accountOne, Account accountTwo) {
        // переводить деньги можно только на другой счёт
        if (accountOne.id.equals(accountTwo.id))
            throw new IllegalArgumentException("Нельзя перевести деньги на тот же аккаунт. Id: " + accountOne.id);
        // сумма перевода должна быть больше 0
        if (amount <= 0)
            throw new IllegalArgumentException("Сумма перевода должна быть больше 0. Текущая сумма: " + amount);


        //Новые if-вы
        if (accountOne.balance < amount)
            throw new IllegalArgumentException("Баланс меньше 0");
        if (accountTwo.balance + amount < 0) {
            throw new IllegalArgumentException("Если перевод выполнится счёт будет переполнен");
        }


        accountOne.balance -= amount;
        accountTwo.balance += amount;
    }
}

class Account {
    public String id;
    public int balance;

    public Account(String id, int balance) {
        this.id = id;
        this.balance = balance;
    }
}
