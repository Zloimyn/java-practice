import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[] may2022 = {26, 19, 13, 17, 20, 24, 12, 17, 21, 19, 20, 23, 26, 25, 24, 27, 26, 18, 20, 25, 31, 20, 22, 28, 30, 34, 31, 16, 27, 30, 24};
//        comfortCount(may2022);
//        printAverageTemp(may2022);
//        int[] may2023 = {12, 12, 15, 17, 22, 25, 27, 29, 21, 24, 27, 21, 25, 13, 20, 23, 24, 12, 19, 23, 24, 26, 24, 25, 27, 22, 23, 23, 29, 33, 33};
//        comfortCount(may2023);
//        printAverageTemp(may2023);

//        boolean year = year(20);
//        System.out.println(year);

//        int[] nums = {23,42,35,12,55,66,124,52};
//        int total = result(nums);
//        System.out.println(total);

        String country = "Казахстан";
        String city = "Астана";
        String category = "Наушники";
        double price = 249_990;
        calculateOrder(country,city,category,price);

    }


//    public static void comfortCount(int[] may){
//        int temp = 0;
//        for (int i = 0; i < may.length; i++) {
//            if (may[i] >= 17 && may[i] <= 22){
//                temp++;
//            }
//        }
//        System.out.println("Дней с комфортной температурой: "+temp);
//    }
//    public static void printAverageTemp(int[] may){
//        double temp = 0;
//        for (int i = 0; i < may.length; i++) {
//            temp += may[i];
//        }
//        System.out.println("Средняя температура в мае будет: "+temp/ may.length);
//    }



//    public static boolean year(int year){
//        if (year >= 18){
//            return true;
//        }else {
//            return false;
//        }
//    }



//    public static int result(int[] number){
//        int max = number[0];
//        for (int i = 0; i < number.length; i++) {
//            if (max < number[i]){
//                max = number[i];
//            }
//        }
//        return max;
//    }
public static void calculateOrder(String country,String city,String category,double price){
    double rateUSD = 538.58;
    double priceAfterDiscount = calculateDiscount(price, category);
    double delivery = calculateDelivery(country, city) * rateUSD;
    double tax = calculateTax(priceAfterDiscount,country,city);
    double totalNotax = priceAfterDiscount;
    double tax2 = tax * 0.01;
    double tax3 = tax2 * totalNotax;



    double total = priceAfterDiscount + delivery + tax3;



    System.out.println("Стоимость после применения скидки: " + priceAfterDiscount);
    System.out.println("Доставка: " + delivery);
    System.out.println("С учетом налога " + tax3 );
    System.out.println("Итого: " + total);

}


    public static double calculateTax(double price, String country, String city){
        if (country.equals("США")) {
            if (city.equals("Нью-Йорк")) {
                return 14;
            } else if (city.equals("Лос-Анджелес")) {
                return 15;
            } else {
                return 12;
            }
        } else if (country.equals("Германия")) {
            if (city.equals("Берлин")) {
                return 11;
            } else {
                return 10;
            }
        } else if (country.equals("Казахстан")) {
            return 17;
        } else {
            return 13;
        }
    }


    public static double calculateDelivery(String country, String city) {
        if (country.equals("США")) {
            if (city.equals("Нью-Йорк")) {
                return 0;
            } else if (city.equals("Лос-Анджелес")) {
                return 5;
            } else {
                return 7;
            }
        } else if (country.equals("Германия")) {
            if (city.equals("Мюнхен")) {
                return 12;
            } else {
                return 13;
            }
        } else if (country.equals("Казахстан")) {
            return 15;
        } else {
            return 20;
        }
    }


    public static double calculateDiscount(double price, String category) {
        if (category.equals("Наушники") || category.equals("Смартфоны")) {
            return price * 0.9;
        } else if (category.equals("Ноутбуки")) {
            return price * 0.85;
        } else {
            return price;
        }
    }



}
