package t9_encapculations.oopNasledovanie;

public class Media {
    String name;
    double time;
    String genre;

    public Media(String newName,String newGenre,double newTime){
        name = newName;
        genre = newGenre;
        time = newTime;
    }
    void display(){
        System.out.println("Название: "+this.name);
        System.out.println("Продолжительность: "+this.time);
        System.out.println("Жанр: "+this.genre);
    }
}
