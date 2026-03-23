package T16_ClassString_and_more.Task12_Formatirovanie;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void printCheck(String[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%-10s  %5s  %13s \n" ,items[i].split(","));
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        System.out.println(n);
        for (int i = 0; i < n; ++i) {
            values[i] = scanner.nextLine();
        }
        printCheck(values);
    }
}


