package T10_Object.Equals;

public class Song {
    private final String title;
    private final String artist;
    private final String songwriter;

    Song(String newTitle,String newArtist,String newSongwriter){
        title = newTitle;
        artist = newArtist;
        songwriter = newSongwriter;
    }
    // переопределите метод equals(Object)

    @Override
    public boolean equals(Object obj) {
        if (this == obj){return true;}
        if (obj == null){return false;}
        if (this.getClass() != obj.getClass()){return false;}
        Song otherSong = (Song) obj;
        return title.equals(otherSong.title) &&
                artist.equals(otherSong.artist) &&
                songwriter.equals(otherSong.songwriter);
    }
}
