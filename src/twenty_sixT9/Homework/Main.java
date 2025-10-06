package twenty_sixT9.Homework;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota",120);
        car.move();
        car.honk();
        car.stop();

        Bicycle bicycle = new Bicycle("Giant",25);
        bicycle.move();
        bicycle.ringBell();
        bicycle.stop();

    }
}
