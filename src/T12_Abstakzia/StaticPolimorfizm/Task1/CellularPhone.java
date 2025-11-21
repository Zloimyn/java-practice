package T12_Abstakzia.StaticPolimorfizm.Task1;

// Допишите реализацию класса CellularPhone
public class CellularPhone extends Phone {
    public CellularPhone(String number) {
        super(number);
    }

    public final void call(String targetNumber) {
        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
    }
}
