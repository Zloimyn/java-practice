package twenty_sixT9.twenti_nain;

public class Human {
    private String name;
    private int age;

    Human(String newName,int newAge){
        name = newName;
        age = newAge;
    }

    void display (){
        System.out.print("Меня зовут: "+name+" .Мне: "+age+" лет .");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
