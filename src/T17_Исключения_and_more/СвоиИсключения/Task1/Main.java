package T17_Исключения_and_more.СвоиИсключения.Task1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        calculate();
        // перехват исключения LimitException
    }

    public static double getInterest(final double rate, final int time, final double principal) {
        final double multiplier = Math.pow(1.0 + rate / 100.0, time) - 1.0;
        return multiplier * principal;
    }

    public static int getIntLimited(String greeting, int attempts) {
        for (int counter = 0; counter < attempts; counter++) {
            try {
                System.out.println(greeting + " => ");
                try {
                    final int value = Integer.parseInt(scanner.nextLine());
                    try {

                    }catch (){

                    }
                    InputException inputException = new InputException(greeting,value);


                    // проверка на отрицательное значение
                    return value;
                } catch (NumberFormatException exception) {

                    InputException inputException = new InputException(greeting,attempts);
                    inputException.notaNumber();
                }
            } catch (InputException exception) {

                InputException inputException = new InputException(greeting, attempts);
                inputException.problemInput();
            }
        }
        try {

        }catch (LimitException e){
            System.out.println("Превышен лимит ошибок ввода: " + attempts);
        }
        // сгенерируйте исключение LimitException с сообщением "Превышен лимит ошибок ввода"
    }

    public static double getDoubleLimited(String greeting, int attempts) {
        for (int counter = 0; counter < attempts; counter++) {
            try {
                System.out.println(greeting + " => ");
                // добавьте недостающий код
                try {
                    final double value = Double.parseDouble(scanner.nextLine());
                    InputException inputException = new InputException(greeting,value);
                    inputException.numberIsNormal();


                    return value;
                } catch (NumberFormatException exception) {
                    InputException inputException = new InputException(greeting,attempts);
                    inputException.notaNumber();

                }
            } catch (InputException exception) {
                InputException inputException = new InputException(greeting, attempts);
                inputException.problemInput();

            }
        }
        try {

        }catch (LimitException e){
            System.out.println("Превышен лимит ошибок ввода: " + attempts);
        }
        // сгенерируйте исключение LimitException
    }

    public static void calculate() {
        final double rate = getDoubleLimited("Введите ставку", 3);
        final double principal = getDoubleLimited("Введите размер вклада", 3);
        final int time = getIntLimited("Введите срок вклада в месяцах", 5);
        System.out.println("Ваша выгода = " + getInterest(rate, time, principal));
    }
}
