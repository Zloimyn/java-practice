package T12_Abstakzia.Djeneriki.Extend_Djeneriki.Task1;

import java.util.List;

public class Printer<LilPip extends Number> {
private final List<LilPip> list;

public Printer(List<LilPip> list) {
    this.list = list;
}

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            double price = list.get(i).doubleValue() / 100;
            System.out.println("Цена товара: " + price + " $.");
        }
    }
}