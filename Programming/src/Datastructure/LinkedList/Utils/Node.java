package Datastructure.LinkedList.Utils;


public class Node {
    public int data;
    public Node next;

    public static void main(String[] args) {

        /* Adding three node to the linked list */
        // declaring the head of the linkedlist
        Node list = new Node();
        list.addNodesToLinkedList();
    }


    public Node addNodesToLinkedList() {
        Node llist = new Node();
        llist.data = 1;

        // creating second node and attach it to the head
        Node node2 = new Node();
        node2.data = 2;

        // creating third node and attach with the first
        Node node3 = new Node();
        node3.data = 3;

        // creating last node and since it's the last node attach to the null;
        Node node4 = new Node();
        node4.data = 4;

        Node node5 = new Node();
        node5.data = 5;

        llist.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        return llist;
    }

    /* iterating linkedlist*/
    public void printLinkedList(Node head) {
        while (head != null) {
            System.out.println("Node - " + head.hashCode() + " with pointer and " +
                    "data " + head.data);
            head = head.next;
        }
    }
}
