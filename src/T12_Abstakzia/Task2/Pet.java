package T12_Abstakzia.Task2;

public abstract class Pet {
    int pawsCount;

    public int getPawsCount() {
        return pawsCount;
    }

    public Pet(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    void sleep(){
        System.out.println("Сплю");
    }

    void play(){
        System.out.println("Играю");
    }

    abstract void giveVoice();
}
