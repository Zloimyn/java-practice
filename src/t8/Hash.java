package t8;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;

public class Hash {
    public static void main(String[] args) {
//        HashMap<String,Double> students = new HashMap<>();
//        students.put("Bob",92.1);
//        students.put("Sam",87.6);
//        students.put("Jack",89.22);
//        students.put("Tom",92.0);
//        System.out.println(students);
//
//        System.out.println(students.containsKey("Kok"));
//
//        students.put("Bob",93.5);
//        System.out.println(students);
//        System.out.println(students.keySet());
//        Double maxNum = 0.0;
//        Double srArifmetic = 0.0;
//        for (Double name : students.values()){
//            maxNum+=name;
//        }
//        srArifmetic += maxNum / students.size();
//        System.out.println(srArifmetic);

        Scanner scanner = new Scanner(System.in);
        HashMap<String,Double> currencies = new HashMap<>();
        currencies.put("USD",534.9);
        currencies.put("EUR",5342.92);
        currencies.put("RUB",6.59);
        System.out.println("ВВедите сумму в тг: ");
        Double balance = scanner.nextDouble();
        System.out.println("ВВедите валюту: ");
        String valita = scanner.next();

        if (valita.equals("USD")){
           System.out.println(balance+" тг.Что составляет в USD: ");
           balance/=534.9;
           System.out.println(balance);
        } else if (valita.equals("EUR")) {
           System.out.println(balance+" тг.Что составляет в EUR: ");
           balance/=5342.92;
           System.out.println(balance);
        } else if (valita.equals("RUB")) {
           System.out.println(balance+"тг .Что составляет в RUB: ");
           balance/=6.59;
           System.out.println(balance);
         }else {
           System.out.println("Валюта не найдена");
         }

    }
}
