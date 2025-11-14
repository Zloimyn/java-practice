package T12_Abstakzia.Task2;

public class Cat extends Pet{
    public Cat(int pawsCount, String voice) {
        super(pawsCount, voice);
    }

    void catchMouse(){
        System.out.println("Поймал мышь");
    }

}
