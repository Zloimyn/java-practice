package t9_encapculations.oopNasledovanie;

public class Series extends Film {
    int numberEpisodes;

    public Series(String newName,String newGenre,double newTime,double newRating,int newNumberEpisodes){
        super(newName,newGenre,newTime,newRating);
        numberEpisodes = newNumberEpisodes;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Количество: "+this.numberEpisodes);
    }
}
