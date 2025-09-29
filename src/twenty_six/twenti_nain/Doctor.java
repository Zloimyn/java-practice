package twenty_six.twenti_nain;

public class Doctor extends Human {
    String profession;
    public Doctor(String newName, int newAge) {
        super(newName, newAge);
        profession = "Доктор";
    }

    @Override
    void display (){
        System.out.println("Меня зовут: "+getName()+" .Мне: "+getAge()+" лет .Моя профессия: "+profession);
    }

}
