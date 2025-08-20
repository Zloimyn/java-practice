import javax.sound.midi.Soundbank;
import java.io.FilterOutputStream;
import java.util.Scanner;

public class javaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);





//        int[] radiohead = {1993, 1995, 1997, 2000, 2001, 2003, 2007, 2011, 2016};
//        int max = 0;
//        String temp = "";
//        for (int i = 0; i < radiohead.length - 1; i++) {
//            temp += radiohead[i + 1] - radiohead[i];
//            if (radiohead[i + 1] != radiohead[radiohead.length - 1]) {
//                temp += ", ";
//            } else if (max > radiohead[i + 1] - radiohead[i]) {
//                max +=radiohead[i];
//            }
//        }
//        System.out.println("Интервалы между выпусками альбомов (в годах): [" + temp + "]");
//        System.out.println("Самый продолжительный период без альбомов: " + max);


//        int[] nums = {3, 5, 7 ,9};
//        int temp = 0;
//        int firstInterval = nums[1] - nums[0];  //2
//        for (int i = 1; i < nums.length - 1; i++) {
//            System.out.println(nums[i] + " " + nums[i + 1]);
//            int secondInterval = nums[i+1] - nums[i];//9-7=2
//            temp+=secondInterval;
//        }
//        if (firstInterval == temp){
//            System.out.println("Да");
//        } else {
//            System.out.println("Нет");
//        }


//        int[] nums = {1, 3, 5, 7, 9};
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum+= nums[i];
//        }
//        int temp = nums.length;
//        int arevmetic = sum / temp;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < arevmetic){
//                System.out.println(nums[i]);
//            }
//        }


//        int[] nums = {1,3,4,5,-1,-4,23};
//        int max = nums[0];
//        int min = nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > max){
//                max = nums[i];
//            } else if (nums[i] < min) {
//                min = nums[i];
//            }
//        }
//        System.out.println(max+" "+min);


//        Massive::::::::::
//        String[] friends = {"pavel","denis","Sanczhar"};
//        friends[1] = "Egor";
//        String a = friends[0];
//        System.out.println(friends[1]);
//        String[] words = new String[2];

//        String[] cities = {"Moscow","Astana","Almata","London",};
//        String temp = cities[0];
//        cities[0] = cities[cities.length-1];
//        cities[cities.length-1] = temp;
//        int[] nums = {1,2,3,4,5,3,6};

//        double[] money = {7000.2,14000,500,4500.5,1800.2,6000.3,32000.2};
//        money[2]+=450;
//        double total = money[1] + money[5] + money[6];
//        System.out.println(money[2]);
//        System.out.println(total);

//        String[] cities = {"Moscow","Astana","Almata","London",};
//        for (int i = 0; i < cities.length; i++) {
//            System.out.println(cities[i]);
//        }

//        int a = 0;
//        String[] cities = {"Moscow","Astana","Almata","London",};
//        for (int i = 0; i < cities.length; i++) {
//            a++;
//            System.out.println( i+1+" "+  cities[i]);
//        }

//        String[] developers = {"pop","opp","ppop","op","poop","op","pop","op"};
//        int count = 0;
//        for (int i = 0; i < developers.length; i++) {
//            if (developers[i].equals("pop")){
//                count++;
//               }
//        }
//        System.out.println(count);

//        String[] week = {"Пасмурно","Солнечно","Облачно","Солнечно","Солнечно","Солнечно","Гроза"};
//        int temp = 0;
//
//        for (int i = 0; i < week.length; i++) {
//            if (week[i].equals("Солнечно")){
//                temp++;
//            }
//        }
//        System.out.println("На этой недели солнечных дней " + temp);

//        int[] may2022 = {
//                26, 19, 13, 17, 20, 24, 12, 17, 21, 19, 20, 23, 26, 25, 24, 27, 26, 18, 20, 25, 31, 20, 22, 28, 30, 34, 31, 16, 27, 30, 24 };
//        int temp = 0;
//        for (int i = 0; i < may2022.length; i++) {
//            if (may2022[i] >= 17 && may2022[i] <= 22){
//                temp++;
//            }
//        }
//        System.out.println("Дней с комфортной температурой в мае будет " + temp);


//        int[] number = {5, 6, 2, 3, 9, 12, 1, 15};
//        for (int i = number.length-1; i >= 0 ; i--) {
//            System.out.println(number[i]);
//        }

//        int[] number = {5, 6, 2, 3, 9, 12, 1, 15};
//        for (int i = 1; i < number.length-1 ; i++) {
//            System.out.println(number[i]);
//        }

//        int[] number = {5, 6, 2, 3, 9, 12, 1, 15};
//        for (int i = 0; i < number.length/2; i++) {
//            System.out.println(number[i]);
//        }

//        int[] number = {5, 6, 2, 3, 9, 12, 1, 15};
//        for (int i = number.length/2; i < number.length; i++) {
//            System.out.println(number[i]);
//        }

//        int[] number = {5, 6, 2, 3, 9, 12, 1, 15};
//        int total = 0;
//        for (int i = 0; i < number.length; i++) {
//            total += number[i];
//        }
//        System.out.println(total);

//        int[] number = {5, 6, 2, 3, 9, 12, 1, 15};
//        for (int i = 0; i < number.length; i++) {
//
//            if (number[i] % 2 == 0) {
//                System.out.println(number[i]);
//            }
//        }


//            while (true) {
//            System.out.println("1. Американо");
//            System.out.println("2. Капучино");
//            System.out.println("3. Латте");
//            System.out.println("0. Выйти");
//            System.out.println("Выберите напиток");
//            String cofe = scanner.next();
//            if (cofe.equals("1")) {
//                System.out.println("Вы выбрали Американо");
//            } else if (cofe.equals("2")) {
//                System.out.println("Вы выбрали Капучино");
//            } else if (cofe.equals("3")){
//                System.out.println("Вы выбрали Латте");
//            } else if (cofe.equals("0")){
//                System.out.println("Вы вышли из меню");
//                break;
//            } else {
//                System.out.println("Неверно");
//            }
//        }

//        System.out.println("Введите пароль");
//        while (true){
//            String password = scanner.next();
//            if (password.equals("admin") ){
//                System.out.println("Доступ разрешен");
//                break;
//            }else {
//                System.out.println("Неправильные пароль, попробуйте еще раз");
//


    }
}
