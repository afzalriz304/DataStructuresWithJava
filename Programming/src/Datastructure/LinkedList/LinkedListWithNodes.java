package Datastructure.LinkedList;

public class LinkedListWithNodes {
    Node headNode;

    static class Node{
        int data;
        Node next;
    }

    public static void main(String[] args) {

        /* Adding three node to the linked list */
        // declaring the head of the linkedlist
        LinkedListWithNodes head=new LinkedListWithNodes();
        head.headNode = new Node();
        head.headNode.data=1;

        // creating second node and attach it to the head
        Node node2=new Node();
        node2.data=2;

        // creating third node and attach with the first
        Node node3=new Node();
        node3.data=3;

        // creating last node and since it's the last node attach to the null;
        Node node4=new Node();
        node4.data=4;

        head.headNode.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;

        printLinkedList(head.headNode);
    }

    /* iterating linkedlist*/
    public static void printLinkedList(Node head){
        while (head!=null){
            System.out.println("Node "+head+" with pointer and data "+head.data);
            head=head.next;
        }
    }
}
