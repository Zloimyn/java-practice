package T11_MoreInformations.Task1.T11_MoreInformTask2_final;
import java.util.ArrayList;
import java.util.List;


public class Song {

    final String artist;
    final String title;
    final String genre;

    public Song(String artist,String title,String genre) {
        this.title = title;
        this.genre = genre;
        this.artist = artist;
    }

    public static void main(String[] args) {
        List<Song> goldenHitsCollection = new ArrayList<>();

        goldenHitsCollection.add(new Song("Дешон Голден","Never Broke Again","hip-hop ,rock"));
        for (Song get : goldenHitsCollection){
            System.out.print(get.artist+ " ,");
            System.out.print(get.genre+ " ,");
            System.out.print(get.title);
        }
    }
}