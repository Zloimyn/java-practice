package twenty_six.Homework;

public class Car extends Transport {

    Car(String newMark,int newSpeed){
        super(newMark,newSpeed);
    }

    void honk(){
        System.out.println("Автомобиль сигналит");
    }
}
