package B_V2_TaskTrecker;

import java.util.HashMap;

public class Node {
    Task data;
    Node prev;
    Node next;
    Node head;
    Node tail;
    HashMap<Integer,Node> historyMapa = new HashMap<>();

    Node(Task task){
        this.data = data;
    }

}
