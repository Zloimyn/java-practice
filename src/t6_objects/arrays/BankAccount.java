package t6_objects.arrays;

public class BankAccount {
    double balance;
    String owner;

    void deposit(int amount){
        if (amount>0){
            balance+=amount;
        }else {
            System.out.println("Нельзя пополнить на отрицательную сумму");
        }
    }

    void withdraw(int removal){
        if (balance > removal){
            balance -=removal;
        }else {
            System.out.println("У вас недостаточно денег");
        }
    }

    void transfer(BankAccount account, double amount){
        if (amount<=balance){
            balance-=amount;
            account.balance+=amount;
        }else {
            System.out.println("Не хватает средств для перевода");
        }
    }

    void buy(Product product){
        if (product.price<=balance){
            balance-=product.price;
            System.out.println("Куплен продукт: "+product.name);
        }else {
            System.out.println("Для приобретения товара вам нехватает денежных средств ");
        }
    }
}
