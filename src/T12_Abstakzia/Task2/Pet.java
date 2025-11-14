package T12_Abstakzia.Task2;

public abstract class Pet {
    int pawsCount;
    String voice;

    public String getVoice() {
        return voice;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public Pet(int pawsCount,String voice) {
        this.pawsCount = pawsCount;
        this.voice = voice;
    }

    void sleep(){
        System.out.println("Сплю");
    }

    void play(){
        System.out.println("Играю");
    }

}
