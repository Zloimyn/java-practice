package T14_КоллекцияИитерфейс.LinketLists.DoublyLinkedList;

public class DoubleLinkedList<T> {
    public Node<T> head;
    public Node<T> tail;
    private int size = 0;

    void addLast(T newElement){
        if (size == 0){
            Node<T> newNode = new Node<T>(newElement);
            head = newNode;
            tail = newNode;
            size++;
        }
        Node<T> oldTail = tail;
        tail = new Node<>(newElement);
        tail.prev = oldTail;
        oldTail.next = tail;
        size++;
    }

    void addFirst(T newElement){
        if (size == 0){
            Node<T> newNode = new Node<T>(newElement);
            head = newNode;
            tail = newNode;
            size++;
        }
        Node<T> oldhead = new Node<>(newElement);
        head = new Node<>(newElement);
        oldhead.prev = head;
        head.next = oldhead;
        size++;
    }

    void addId(int userId, T newElement) {

        if (userId < 0 || userId >= size) {
            System.out.println("Неверный ID");
            return;
        }

        Node<T> current;

        if (userId < size / 2) {
            current = head;
            for (int i = 0; i < userId; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > userId; i--) {
                current = current.prev;
            }
        }

        Node<T> newNode = new Node<>(newElement);

        if (current == head && current == tail) {
            head = newNode;
            tail = newNode;
            return;
        }

        if (current == head) {
            newNode.next = head.next;
            head.next.prev = newNode;
            head = newNode;
            return;
        }

        if (current == tail) {
            newNode.prev = tail.prev;
            tail.prev.next = newNode;
            tail = newNode;
            return;
        }

        Node<T> prevNode = current.prev;
        Node<T> nextNode = current.next;

        prevNode.next = newNode;
        newNode.prev = prevNode;

        newNode.next = nextNode;
        nextNode.prev = newNode;
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
