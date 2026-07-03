package T21_Tests.Task1.Zadachka3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void shouldNotBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        assertFalse(account.isBlocked());
    }

    @Test
    void shouldBeBlockedAfterBlockIsCalled () {
        BankAccount account = new BankAccount("a", "b");
        account.block();
        assertTrue(account.isBlocked());
    }

    @Test
    void shouldReturnFirstNameThenSecondName () {
        BankAccount account = new BankAccount("a", "b");
        assertArrayEquals(account.getFullName(),account.getFullName());
    }

    @Test
    void shouldReturnZeroAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("KZT");
        assertEquals(0, account.getAmount());
        assertEquals("KZT", account.getCurrency());
    }

    @Test
    void shouldReturnNullAmountWhenNotActive () {
        BankAccount account = new BankAccount("a", "b");
        String[] expected = {"a","b"};
        assertArrayEquals(expected, account.getFullName());
    }
}
