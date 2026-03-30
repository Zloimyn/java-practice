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
            int nameProductLength = 0;
            int kolvo = 0;

            for (int i = 0; i < items.length; i++) {
                String[] allSplit = items[i].split(",");

                int nameLength = allSplit[0].trim().length();
                int kolvoLength = allSplit[1].trim().length();

                if (kolvoLength > kolvo){
                    kolvo =  kolvoLength + 1;
                }
                if (nameLength > nameProductLength){
                    nameProductLength = nameLength + 1;
                }
            }

            for (int i = 0; i < items.length; i++) {
                System.out.printf("%-" + nameProductLength + "s%-" + kolvo + "s %s\n",items[i].split(","));
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

