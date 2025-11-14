package T12_Abstakzia.Task2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(4,"Мяу");
        cat.catchMouse();
        cat.getVoice();

        Dog dog = new Dog(4," ");
        dog.bringStick();
        dog.play();

        Hamster hamster = new Hamster(4," ");
        hamster.hideFood();
        hamster.sleep();

        Fish fish = new Fish(1,"Буль");
        fish.sleep();

        Spider spider = new Spider(6," ");
        System.out.println("У паука " + spider.getPawsCount() + "лапок.");
    }
}
