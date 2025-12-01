package T12_Abstakzia.Djeneriki.Extend_Djeneriki.Task2;

// Дополните объявление класса Contact
public abstract class Contact {
    String name;
    Contact(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    // Класс должен содержать одно поле - имя пользователя name

    // И два метода - sendMessage() для отправки сообщения и print() для печати информации о контакте
    abstract void sendMessage();
    abstract void print();
}
