package T21_Tests.Task1;

public class Main {
    public int sumAfterDiscount(int sum) {
        if (sum < 1000){
            return sum;
        }else {
            return (int) (sum * 0.98);
        }
    }

    public static void main(String[] args) {
        MainTest test = new MainTest();
        test.giveNo999();
    }
}

class TestLibrary {
    public static <WW> void assertEquals(WW temp1, WW actual) {
        if (!temp1.equals(actual)) {
            throw new RuntimeException("actual не сходится".formatted(actual, temp1));
        }
    }
}


class MainTest{
    Main test = new Main();

    public void giveNo999(){
        int buySum = 999;
        int expectedSum = 999;

        int resultSum = test.sumAfterDiscount(buySum);

        TestLibrary.assertEquals(expectedSum, resultSum);
    }
}
