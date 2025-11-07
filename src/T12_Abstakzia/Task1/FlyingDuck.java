package T12_Abstakzia.Task1;

public class FlyingDuck extends Duck {
    FlyingDuck(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("Лечу куда хочу.");
    }

    public void eat() {
        System.out.println("Обычно кушаю разные семена, но иногда нахожу хлебушек.");
    }
}
