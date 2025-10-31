package twenty_sixT9.nine_ten;

import java.util.Objects;

public class Movie {
    String title; // название фильма
    int releaseYear; // год выхода на экраны
    Movie(String newTitle,int newReleaseYear){
        title = newTitle;
        releaseYear = newReleaseYear;
    }

    public String description() { // метод для вывода описания фильма
        return '"' + title + "\" (" + releaseYear + " год)";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return releaseYear == movie.releaseYear && Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, releaseYear);
    }
}
