package T16_ClassString_and_more.Task12_Formatirovanie;

import java.util.Scanner;

public class Main2 {

        private static int findMaxLength(String[] elements) {
            int max = 0;
            for (String e : elements) {
                if (e.length() > max) {
                    max = e.length();
                }
            }
            return max;
        }

        public static void printCheck(String[] items) {
            int nameProduct = 0;
            int kolvo = 0;
            int left = 0;

            for (int i = 0; i < items.length; i++) {
                if (left < findMaxLength(items[i].split(","))){
                    left = findMaxLength(items[i].split(",")) + 2;
                }
                nameProduct = findMaxLength(items[i].split(","));
            }

            for (int i = 0; i < items.length + 1; i++) {
                kolvo = findMaxLength(items[i].split(",")) - 1;
                break;
            }

            for (int i = 0; i < items.length; i++) {
                System.out.printf("%-" + kolvo + "s" + "%" + nameProduct + "s" + "%" + left + "s" + "\n",items[i].split(","));
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество записей:");
            int n = Integer.parseInt(scanner.nextLine());
            String[] values = new String[n];
            for (int i = 0; i < n; ++i)
                values[i] = scanner.nextLine();
            printCheck(values);
        }
}

