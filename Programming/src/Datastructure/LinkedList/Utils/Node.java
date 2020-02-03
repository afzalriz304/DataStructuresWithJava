package Datastructure.LinkedList.Utils;

public class Node {
    public int data;
    public Node next;


    /* iterating linkedlist*/
    public void printLinkedList(Node head){
        while (head!=null){
            System.out.println("Node - "+head.hashCode()+" with pointer and " +
                    "data "+head.data);
            head=head.next;
        }
    }
}
