package T12_Abstakzia.Task2;

public class Dog extends Pet{
    public Dog(int pawsCount) {
        super(pawsCount);
    }

    void bringStick(){
        System.out.println("Принес палочку");
    }

    @Override
    void giveVoice() {
        System.out.println("Гавкалка");
    }
}
