package T17_Исключения_and_more.Task3;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        System.out.print("Введите целое число => ");
        Scanner scanner = new Scanner(System.in);
        final String inputValue = scanner.next();
        try {
            final int parsedValue = IntegerParser.parseInt(inputValue);
            System.out.println(parsedValue);
        }catch (StringNotNumberException e){
            System.out.println("Вы ввели не целое число.");
        }catch (StringIsTooSmallNumberException e){
            System.out.println("Введённое число слишком маленькое.");
        }catch (StringIsTooBigNumberException e){
            System.out.println("Введённое число слишком большое.");
        }catch (EmptyStringException e){
            System.out.println("Введена пустая строка.");
        }
    }
}
