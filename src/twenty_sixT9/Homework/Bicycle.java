package twenty_sixT9.Homework;

public class Bicycle extends Transport {

    Bicycle(String newMark,int newSpeed){
        super(newMark,newSpeed);
    }

    void ringBell(){
        System.out.println("Велосипед звонит в звонок");
    }
}
