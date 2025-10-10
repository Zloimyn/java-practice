package T10_Object.Task2;

import java.util.ArrayList;

public class LostAndFoundOffice {
    ArrayList<Object> things = new ArrayList<>();

    void put (Object name){
        if (name != null){
            things.add(name);
        }else {
            System.out.println("Вещь должна иметь имя");
        }
    }

    Boolean check(Object name){
        if (name != null){
            for (Object object : things) { // логика проверки вещи в списке
                if (object.equals(name)) {
                    return true;
                }
            }
        }else {
            return false;
        }
        return false;
    }
}
