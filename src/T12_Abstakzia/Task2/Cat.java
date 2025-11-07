package T12_Abstakzia.Task2;

public class Cat extends Pet{
    public Cat(int pawsCount) {
        super(pawsCount);
    }

    void catchMouse(){
        System.out.println("Поймал мышь");
    }

    @Override
    void giveVoice() {
        System.out.println("Мяю");
    }
}
