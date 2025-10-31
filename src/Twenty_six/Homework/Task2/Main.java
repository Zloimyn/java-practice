package Twenty_six.Homework.Task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.mark = "Toyota";
        car.speed = 120;
        move(car.mark, car.speed);
        car.honk();
        stop();

        Bicycle bicycle = new Bicycle();
        bicycle.mark = "Giant";
        bicycle.speed = 25;
        move(bicycle.mark, bicycle.speed);
        bicycle.ringBell();
        stop();

    }

    public static void move(String mark,int speed){
        System.out.println(mark+" движется со скоростью "+speed+" км/ч");
    }

    public static void stop(){
        System.out.println("Траспорт остановился");
    }
}
