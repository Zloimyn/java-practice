package T12_Abstakzia.Task2;

public class Dog extends Pet{
    public Dog(int pawsCount, String voice) {
        super(pawsCount, voice);
    }

    void bringStick(){
        System.out.println("Принес палочку");
    }

}
