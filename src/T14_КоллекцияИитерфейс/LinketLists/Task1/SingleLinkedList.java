package T14_КоллекцияИитерфейс.LinketLists.Task1;

public class SingleLinkedList<T> {
    public Node<T> head;
    private int size = 0;

    void add(T newElement){
        Node<T> oldNode = head;
        head = new Node<T>(newElement);
        head.next = oldNode;
    }
}

class Node<T>{
    public T data;
    public Node<T> next;

    public Node(T data){
        this.data = data;
    }
}
