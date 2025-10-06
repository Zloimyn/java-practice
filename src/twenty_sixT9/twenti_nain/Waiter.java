package twenty_sixT9.twenti_nain;

public class Waiter extends Human {
    String profession;
    public Waiter(String newName, int newAge) {
        super(newName, newAge);
        profession = "Официант";
    }

    @Override
    void display() {
        System.out.println("Меня зовут: "+getName()+" .Мне: "+getAge()+" лет .Моя профессия: "+profession);
    }
}
