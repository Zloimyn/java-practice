package t8;
import java.util.ArrayList;
import java.util.Scanner;

public class t8 {
    public static void main(String[] args) {
//        //структура данных = массив = список
//        //список
//        int[] nums = new int[2];
//        //список увеличивается по мере необходимости
//        //только Класами    имя
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1200);
//        list.add(1600);
//        System.out.println(list.get(0));
//        list.add(1, 3210);
//        System.out.println(list.size());
//        System.out.println(list);

//        ArrayList<Double> temperatures = new ArrayList<>();
//        temperatures.add(92.3);
//        temperatures.add(12.4);
//        temperatures.add(74.1);
//        temperatures.add(45.0);
//        Double temp = 0.0;
//        for (int i = 0; i < temperatures.size(); i++) {
//            if (temperatures.get(i)>temp){
//                temp = temperatures.get(i);
//            }
//        }
//        System.out.println("Самая высокая температура: "+temp);

//        ArrayList<Integer> speeds = new ArrayList<>();
//        speeds.add(120);
//        speeds.add(75);
//        speeds.add(42);
//        speeds.add(60);
//        speeds.add(110);
//        speeds.add(20);
//        int sum = 0;
//        for (Integer speed: speeds){
//            sum+=speed;
//        }
//        int averageSpeed = sum / speeds.size();
//        System.out.println("Средняя скорость составляет: "+averageSpeed);

//        ArrayList<String> list = new ArrayList<>();
//        list.add("Java");
//        list.add("C--");
//        list.add("Go");
//        list.add("Python");
//        list.add("Java8");
//        list.add("Java11");
//        String temp = "c--";
//        list.remove("Go");//по имени
//        String remove = list.remove(3);//индекс
//        System.out.println(remove);
//        System.out.println(list.contains(temp));
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            System.out.println("Введите число(exit для выхода)");
            String nums = scanner.next();
            if (nums.equals("exit")) {
                break;
            } else {
                numbers.add(Integer.parseInt(nums));
            }
        }
            System.out.println(numbers);
            System.out.println("Количество чисел: "+numbers.size());

            Integer temp = 0;
            for (int i = 0; i < numbers.size(); i++) {
                temp+=numbers.get(i);
            }
            System.out.println("Сумма чисел: "+temp);



    }
}
