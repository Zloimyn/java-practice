package T12_Abstakzia.Task2;

public class Spider extends Pet{
    public Spider(int pawsCount) {
        super(pawsCount);
    }

    @Override
    void giveVoice() {
        System.out.println("Шипение");
    }
}
