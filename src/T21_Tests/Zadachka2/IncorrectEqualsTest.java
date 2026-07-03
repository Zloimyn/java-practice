package T21_Tests.Zadachka2;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncorrectEqualsTest {
    @Test
    public void shouldReturn(){
        Item item1 = new Item("Яблоки", 50);
        Item item2 = new Item("Яблоки", 50);

        assertEquals(item2,item1);
    }
}

class Item{
    private String name;
    private int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return price == item.price && Objects.equals(name, item.name);
    }

}