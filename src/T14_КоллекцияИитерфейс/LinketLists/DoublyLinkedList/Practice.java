package T14_КоллекцияИитерфейс.LinketLists.DoublyLinkedList;

public class Practice {
    public static void main(String[] args) {
        DoubleLinkedList<String> list1 = new DoubleLinkedList<>();
        DoubleLinkedList<String> list2 = new DoubleLinkedList<>();
        DoubleLinkedList<String> list3 = new DoubleLinkedList<>();
        DoubleLinkedList<String> list4 = new DoubleLinkedList<>();
        DoubleLinkedList<String> list5 = new DoubleLinkedList<>();
        DoubleLinkedList<String> list6 = new DoubleLinkedList<>();
        String name ="Привет";

        list1.addFirst(name);
        list2.addFirst(name);
        list3.addFirst(name);
        list4.addFirst(name);
        list5.addFirst(name);
        list6.addFirst(name);


        for (int i = 0; i < 6; i++) {
            System.out.println(list1);
            System.out.println(list2);
            System.out.println(list3);
            System.out.println(list4);
            System.out.println(list5);
            System.out.println(list6);
        }
    }
}
