package t9_encapculations.oopNasledovanie;

public class Film extends Media {
    double rating;

    public Film(String newName,String newGenre,double newTime,double newRating){
        super(newName,newGenre,newTime);
        rating = newRating;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Рейтинг: "+this.rating);
    }
}
