package T14_КоллекцияИитерфейс.LinketLists.DoublyLinkedList;

import java.util.NoSuchElementException;

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
        Node<T> oldhead = head;
        head = new Node<>(newElement);
        oldhead.prev = head;
        head.next = oldhead;
        size++;
    }
//   Второй способ сделать addFirst:
//    public void addFirst(T element) {
//        final Node<T> oldHead = head;
//        final Node<T> newNode = new Node<>(null, element, oldHead);
//        head = newNode;
//        if (oldHead == null) {
//            tail = newNode;
//        } else {
//            oldHead.prev = newNode;
//        }
//        size++;
//    }

    void add(T newElemnt){
        addFirst(newElemnt);
    }

    void add(int userId, T newElement) {

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

        Node<T> prevCurrent = current.prev;

        prevCurrent.next = newNode;
        newNode.prev = prevCurrent;
        current.prev = newNode;
        newNode.next = current;
    }

    void replaceWith(int userId, T newElement){
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

        if (current == head) {
            newNode.next = current.next;
            head = newNode;
            current.next.prev = newNode;
            return;
        }

        if (current == tail) {
            newNode.prev = current.prev;
            tail = newNode;
            current.prev.next = newNode;
            return;
        }

        newNode.next = current.next;
        current.next.prev = newNode;
        newNode.prev = current.prev;
        current.prev.next = newNode;

    }

    public T getLast() {
        final Node<T> curTail = tail;
        if (curTail == null) {
            throw new NoSuchElementException();
        }
        return tail.data;
    }

    public T getFirst() {
        final Node<T> curHead = head;
        if (curHead == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    private String nodeToString(Node<T> node,int index){
        return "   ↔  " + "Index- " + index + " Значение: "+ node.data;
    }

    public String toString(){
        int index = 0;
        Node<T> node = head;
        String result = "";

        while (node != null){
            result = result + nodeToString(node,index);
            node = node.next;
            index++;
        }
        return result;
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
