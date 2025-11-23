package T12_Abstakzia.StaticPolimorfizm.Task1;

// Допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone {
    public Smartphone(String number) {
        super(number);
    }

    public void makeCall(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }
}
