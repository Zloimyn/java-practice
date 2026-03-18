package T16_ClassString_and_more.Task12_Formatirovanie;

import java.util.Scanner;

public class Main {
    public static void printCheck(String[] items) {
        String[] item = new String[items.length];
        for (int i = 0; i < items.length; i++) {
            item = items[i].split(", ");
        }
        System.out.printf("%-10s %-7s  %-8s \n ",item[0], item[1], item[2]);
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


