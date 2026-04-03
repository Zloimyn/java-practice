package T17_Исключения_and_more.Task4;

public class Main {
    public static void main(String[] args) {
        try {
            calculate();
        } catch (ArithmeticException exception) {
            exception.printStackTrace(); // будет выведен стек-трейс ошибки
        }
        System.out.println("HelloWorld(print())");
    }

    public static int calculate() {
        return 10 / 0;
    }
}
