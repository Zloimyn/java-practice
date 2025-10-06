package twenty_sixT9.Homework;

public class Car extends Transport {

    Car(String newMark,int newSpeed){
        super(newMark,newSpeed);
    }

    void honk(){
        System.out.println("Автомобиль сигналит");
    }
}
