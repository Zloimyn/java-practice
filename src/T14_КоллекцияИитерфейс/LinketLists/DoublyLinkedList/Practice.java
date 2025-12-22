package T14_КоллекцияИитерфейс.LinketLists.DoublyLinkedList;

public class Practice {
    public static void main(String[] args) {
        DoubleLinkedList<String> list1 = new DoubleLinkedList<>();
        String name ="Привет";

        for (int i = 0; i < 100; i++){
            list1.addFirst(name + " " + i);
        }

        System.out.println(list1);
    }
}
