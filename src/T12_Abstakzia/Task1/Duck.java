package T12_Abstakzia.Task1;

public abstract class Duck {
    String name;

    Duck (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void swim(){
        System.out.println("Да, я умею плавать!");
    }
    public void quack(){
        System.out.println("Кря!");
    }
}
