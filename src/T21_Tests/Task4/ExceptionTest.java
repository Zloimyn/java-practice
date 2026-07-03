package T21_Tests.Task4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {
    @Test
    void should() {

        final ArithmeticException exception = assertThrows(

                ArithmeticException.class,

                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        int number = 10 / 0;
                    }
                }
        );

        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    public void assertThrowsTest(){
        String expected = "/ by zero";

        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> System.out.println(5 / 0));

        assertEquals(expected, exception.getMessage());
    }
}
