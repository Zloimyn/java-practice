package T21_Tests.Task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DiscountCalculatorTest {
    DiscountCalculator discountCalculator = new DiscountCalculator();

    @Test
    public void noFor999(){
        int buySum = 999;
        int expectedSum = 999;

        int resultSum = discountCalculator.sumAfterDiscount(buySum);

        Assertions.assertEquals(expectedSum,resultSum);
    }
}

class DiscountCalculator {
    public int sumAfterDiscount(int sum) {
        if (sum < 1000){
            return sum;
        }else {
            return (int) (sum * 0.98);
        }
    }
}
