package T11_MoreInformations.Task1;


public class MountainHare {
     int age;
     double weight;
     int jumpLength;
     static String color;

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        MountainHare.color = color;
    }

    public MountainHare(int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    // добавьте переменные и конструктор

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}
