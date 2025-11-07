package T12_Abstakzia.Task1;

public class Main {
    public static void main(String[] args) {
        FlyingDuck flyingDuck = new FlyingDuck("Обычная утка");
        RubberDuck rubberDuck = new RubberDuck("Резиновая утка");

        System.out.println("Сначала о себе расскажет обычная уточка:");
        System.out.println(flyingDuck.getName());
        flyingDuck.swim();
        flyingDuck.fly();
        flyingDuck.eat();
        flyingDuck.quack();

        System.out.println("А теперь - резиновая:");
        System.out.println(rubberDuck.getName());
        rubberDuck.swim();
        rubberDuck.quack();
    }
}

