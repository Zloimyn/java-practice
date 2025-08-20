package t6_objects;

public class Movie {
    String name;
    String genre;
    int publication;
    double rating;

    void display(){
        System.out.println("Название фильма "+name);
        System.out.println("Рейтинг "+rating);
        System.out.println("Год выпуска "+publication);
        System.out.println("Жанр "+genre);
        System.out.println();
    }

}
