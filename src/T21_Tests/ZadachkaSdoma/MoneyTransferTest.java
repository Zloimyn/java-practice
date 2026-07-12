package T21_Tests.ZadachkaSdoma;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MoneyTransferTest {
    private final MoneyTransferService moneyTransferService = new MoneyTransferService();

    @Test
    void shouldMakeTransfer() {
        Account accountOne = new Account("1", 10);
        Account accountTwo = new Account("2", 10);
        moneyTransferService.transfer(7, accountOne, accountTwo);

        assertEquals(3, accountOne.balance);
        assertEquals(17, accountTwo.balance);
    }

    @Test
    void shouldNotTransferMoneyOnSameAccount() {
        Account accountOne = new Account("1", 10);
        IllegalArgumentException ex = assertThrows
                (IllegalArgumentException.class, new Executable() {
                    @Override
                    public void execute() {
                        moneyTransferService.transfer(
                                5, accountOne, accountOne);
                    }

                });
        assertEquals("Нельзя перевести деньги на тот же аккаунт. Id: 1", ex.getMessage());
    }

    @Test
    public void shouldNotTransferZero() {
        Account accountOne = new Account("1", 10);
        Account accountTwo = new Account("2", 10);
        IllegalArgumentException ex = assertThrows
                (IllegalArgumentException.class, new Executable() {
                    @Override
                    public void execute() {
                        moneyTransferService.transfer(0, accountOne, accountTwo);
                    }

                });
        assertEquals("Сумма перевода должна быть больше 0. Текущая сумма: 0", ex.getMessage());
    }



    //Новые Other.Test-ы
    @Test
    public void shouldNotTransferNegative() {
        Account accountOne = new Account("1", 10);
        Account accountTwo = new Account("2", 10);
        IllegalArgumentException ex = assertThrows
                (IllegalArgumentException.class, new Executable() {

                    @Override
                    public void execute() {
                        moneyTransferService.transfer(15, accountOne, accountTwo);
                    }

                });
        assertEquals("Баланс меньше 0", ex.getMessage());
    }

    @Test
    public void shouldNotTransferMnogoDeneg() {
        Account accountOne = new Account("1", 10);
        Account accountTwo = new Account("2", Integer.MAX_VALUE);
        IllegalArgumentException ex = assertThrows
                (IllegalArgumentException.class, new Executable() {

                    @Override
                    public void execute() {
                        moneyTransferService.transfer(1, accountOne, accountTwo);
                    }

                });
        assertEquals("Если перевод выполнится счёт будет переполнен", ex.getMessage());
    }

}
