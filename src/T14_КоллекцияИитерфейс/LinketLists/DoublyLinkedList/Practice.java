package T14_КоллекцияИитерфейс.LinketLists.DoublyLinkedList;

public class Practice {
    public static void main(String[] args) {
        DoubleLinkedList<String> list1 = new DoubleLinkedList<>();
        String name ="Привет";
        String name2 ="GG";

        for (int i = 0; i < 100; i++){
            list1.addFirst(name + " " + i);
        }

        list1.add(3,name2);

        System.out.println(list1);
        System.out.println(list1.getLast());
    }
}
