package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Множества.Ta4;


public class Qwerty implements Comparable<Qwerty> {
    public String title;
    public String directorName;
    public int rating;

    Qwerty(String title,String directorName, int rating){
        this.title = title;
        this.directorName = directorName;
        this.rating = rating;
    }

    @Override
    public int compareTo(Qwerty qwerty){
        return this.rating - qwerty.rating;
    }
}
