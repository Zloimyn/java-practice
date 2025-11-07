package T12_Abstakzia.Task2;

public class Fish extends Pet{
    public Fish(int pawsCount) {
        super(pawsCount);
    }

    @Override
    void giveVoice() {
        System.out.println("Буль");
    }
}
