package T12_Abstakzia.Task2;

public class Hamster extends Pet{
    public Hamster(int pawsCount, String voice) {
        super(pawsCount, voice);
    }

    void hideFood(){
        System.out.println("Спрятал еду");
    }

}
