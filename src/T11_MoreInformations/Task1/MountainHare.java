package T11_MoreInformations.Task1;


public class MountainHare {


    public MountainHare(int age, double jumpLength, int weight) {
        super(age, jumpLength, weight);
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
