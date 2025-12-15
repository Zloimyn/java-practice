package T14_КоллекцияИитерфейс.LinketLists.DoublyLinkedList;

public class Main<T> {
    public Node<T> head;
    public Node<T> tail;
    private int size = 0;
    void add(T newElement){
        if (size == 0){
            Node<T> newNode = new Node<T>(newElement);
            head = newNode;
            tail = newNode;
        }
        Node<T> oldTail = tail;
        head = new Node<T>(newElement);
        tail.prev = head;
        head.next = oldTail;
    }
}

class Node<T>{
    public T data;
    public Node<T> next;
    public Node<T> prev;

    public Node(T data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
