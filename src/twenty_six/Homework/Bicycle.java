package twenty_six.Homework;

public class Bicycle extends Transport {

    Bicycle(String newMark,int newSpeed){
        super(newMark,newSpeed);
    }

    void ringBell(){
        System.out.println("Велосипед звонит в звонок");
    }
}
