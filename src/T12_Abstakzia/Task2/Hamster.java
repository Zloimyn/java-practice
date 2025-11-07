package T12_Abstakzia.Task2;

public class Hamster extends Pet{
    public Hamster(int pawsCount) {
        super(pawsCount);
    }

    void hideFood(){
        System.out.println("Спрятал еду");
    }

    @Override
    void giveVoice() {
        System.out.println("Cопение");
    }
}
