package T12_Abstakzia.StaticPolimorfizm.Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Вас приветствует виртуальная АТС!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш номер телефона:");
        String number = scanner.next();
        System.out.println("Введите номер пользователя, которому хотите позвонить:");
        String friendNumber = scanner.next();
        System.out.println("Выберите модель телефона собеседника, 1 - стационарный телефон, 2 - мобильный телефон, 3 - смартфон:");
        int type = scanner.nextInt();

        String message = " ";
        if (type < 1 || type > 3) {
            System.out.println("Введена неверная модель телефона");
        }else if (type == 2 || type == 3) {
            System.out.println("Какое сообщение вы хотите переслать?");
            message = scanner.next();
        }

        getPhone(type, number).makeCall(friendNumber,message);
    }

    public static Phone getPhone(int type, String number) {
        if (type == 1){
            // Если выбран стационарный телефон, создайте объект класса CellularPhone
            return new CellularPhone(number);
        } else if (type == 2){
            // Если выбран мобильный телефон, создайте объект класса MobilePhone
            return new MobilePhone(number);
        } else{
            // Иначе создайте экземпляр класса Smartphone
            return new Smartphone(number);
        }
    }
}
