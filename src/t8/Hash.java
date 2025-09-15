package t8;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

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

//        Scanner scanner = new Scanner(System.in);
//        HashMap<String,Double> currencies = new HashMap<>();
//        currencies.put("USD",534.9);
//        currencies.put("EUR",5342.92);
//        currencies.put("RUB",6.59);
//        System.out.println("ВВедите сумму в тг: ");
//        Double balance = scanner.nextDouble();
//        System.out.println("ВВедите валюту: ");
//        String valita = scanner.next();
//
//        if (valita.equals("USD")){
//           System.out.println(balance+" тг.Что составляет в USD: ");
//           balance/=534.9;
//           System.out.println(balance);
//        } else if (valita.equals("EUR")) {
//           System.out.println(balance+" тг.Что составляет в EUR: ");
//           balance/=5342.92;
//           System.out.println(balance);
//        } else if (valita.equals("RUB")) {
//           System.out.println(balance+"тг .Что составляет в RUB: ");
//           balance/=6.59;
//           System.out.println(balance);
//         }else {
//           System.out.println("Валюта не найдена");
//         }



        HashMap<String, ArrayList<Double>> students = new HashMap<>();
        ArrayList<Double> markBOB = new ArrayList<>();
        markBOB.add(87.3);
        markBOB.add(27.9);
        markBOB.add(55.3);
        students.put("Bob",markBOB);
        ArrayList<Double> markJACK = new ArrayList<>();
        markJACK.add(7.3);
        markJACK.add(29.9);
        markJACK.add(95.3);
        students.put("Jack",markJACK);
        ArrayList<Double> markTOMsoN = new ArrayList<>();
        markTOMsoN.add(89.3);
        markTOMsoN.add(66.9);
        markTOMsoN.add(59.3);
        students.put("Tomson",markTOMsoN);
        System.out.println(students);

        Integer temp = 0;
        Double allNum = 0.0;
        for (double num : students.get("Bob")){
            allNum+=num;
            temp++;
        }
        System.out.println();
        Double srArifmetic = allNum / temp;
        System.out.println("Средняя оценка BOBA: "+srArifmetic);

        students.get("Jack").add(55.6);
        System.out.println("Новая оценка для JacKa: "+students.get("Jack"));

        System.out.println("Все оценки студента TOMSONa: "+students.get("Tomson"));

        Integer allMark = 0;
        Double allNumbers = 0.0;
        for (ArrayList<Double> numTwo : students.values()){
            for (int i = 0; i < numTwo.size(); i++) {
                allMark++;
                allNumbers+=numTwo.get(i);
            }
        }
        Double srArifmetic2 = allNumbers / allMark;
        System.out.println("Средняя оценка BсеХ: "+srArifmetic2);
    }
}
