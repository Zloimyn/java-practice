package twenty_six.Homework;

public class Transport {
    String mark;
    int speed;

    Transport(String newMark,int newSpeed){
        mark = newMark;
        speed = newSpeed;
    }

    void stop(){
        System.out.println("Транспорт остановился");
    }

     void move(){
        System.out.println(mark+" движется со скоростью "+speed+" км/ч");
    }
}
