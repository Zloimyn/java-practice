package T21_Tests.Task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main {
    @Test
    public  void  testMul(){
        int factor1 = 2;
        int factor2 = 3;

        int production = factor1 * factor2;

        Assertions.assertEquals(5, production, "Production value is wrong");
    }
}
