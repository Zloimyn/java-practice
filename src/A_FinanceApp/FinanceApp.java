package A_FinanceApp;

import java.util.Scanner;

public class FinanceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] expenses = new double[7];

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        while (true) {
            printMenu();
            String command = scanner.next();
            if (command.equals("1")) {
                convert(moneyBeforeSalary, scanner);
            } else if (command.equals("2")) {
                getAdvice(moneyBeforeSalary, daysBeforeSalary);
            } else if (command.equals("3")) {
                moneyBeforeSalary = saveExpense(moneyBeforeSalary, scanner, expenses);
            } else if (command.equals("4")) {
                printAlExpense(expenses);
            } else if (command.equals("5")) {
                findMaxExpense(expenses);
            } else if (command.equals("0")) {
                break;
            } else {
                System.out.println("Такой команды нету");
            }

        }
    }

    private static void printMenu() {
        System.out.println("Введите команду.");
        System.out.println("1-конвертировать валюту");
        System.out.println("2-получить совет");
        System.out.println("3-Ввести трату");
        System.out.println("4-Показать траты за неделю");
        System.out.println("5-Показать самую большую трату за неделю");
        System.out.println("0-выйти");
    }

    public static void convert(double moneyBeforeSalary, Scanner scanner) {
        double rateUSD = 523.12;
        double rateEUR = 600.26;
        double rateJPY = 3.54;

        System.out.println("В какую валюту вы хотите перевести ваше сбережение?");
        String currency = scanner.next();
        System.out.println("Вы хотите конвертировать тенге в " + currency);
        if (currency.equals("USD")) {
            double totalUSD = moneyBeforeSalary / rateUSD;
            System.out.println("Ваши сбережения в долларах: " + totalUSD);

        } else if (currency.equals("EUR")) {
            double totalEUR = moneyBeforeSalary / rateEUR;
            System.out.println("Ваши сбережения в евро: " + totalEUR);

        } else if (currency.equals("JPY")) {
            double totalJPY = moneyBeforeSalary / rateJPY;
            System.out.println("Ваши сбережения в йенах: " + totalJPY);

        } else {
            System.out.println("Валюта не поддерживается");
        }
    }

    public static void getAdvice(double moneyBeforeSalary, int daysBeforeSalary) {
        if (moneyBeforeSalary < 15000) {
            System.out.println("Сегодня лучше поесть дома.Экономьте, и дотяните до зарплаты");
        } else if (moneyBeforeSalary < 50000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Пора в Im");
            } else {
                System.out.println("Сегодня лучше поесть дома.Экономьте, и дотяните до зарплаты");
            }
        } else if (moneyBeforeSalary < 150000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Неплохо, прикупите долларов и зайдите поужинать в классное место");
            } else {
                System.out.println("Окей пора в Im");
            }
        } else {
            if (daysBeforeSalary < 10) {
                System.out.println("Класс, заказывайте крабов и черной икры");
            } else {
                System.out.println("Неплохо, прикупите долларов и зайдите поужинать в классное место");
            }
        }
    }

    public static double saveExpense(double moneyBeforeSalary, Scanner scanner, double[] expenses) {
        System.out.println("В какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС");
        int day = scanner.nextInt();
        if (day >= 1 && day <= 7) {
            System.out.println("Введите размер траты:");
            int expense = scanner.nextInt();
            if (expense > moneyBeforeSalary) {
                System.out.println("У вас недостаточно денег ");
            } else {
                expenses[day - 1] = expense;
                moneyBeforeSalary -= expense;
                System.out.println("Значение сохранено!Ваш текущий баланс в тенге: " + moneyBeforeSalary);
            }

        } else {
            System.out.println("Такого дня не существует");
        }
        return moneyBeforeSalary;
    }

    public static void printAlExpense(double[] expenses) {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " тенге");
        }
    }

    public static void findMaxExpense(double[] expenses) {
        double max = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > max) {
                max = expenses[i];
                System.out.println("Самой большой тратой за неделю было: " + max);
            }
        }
    }
}