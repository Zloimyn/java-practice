package twenty_sixT9.twenti_nain;

public class Surgeon extends Doctor {
    public Surgeon(String newName, int newAge) {
        super(newName, newAge);
    }

    @Override
    void display() {
        super.display();
        System.out.println(" .А также я хирург");
    }
}
