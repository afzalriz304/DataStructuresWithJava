package Datastructure.LinkedList.Insertion;

import Datastructure.LinkedList.Utils.Node;

import java.util.Scanner;

public class InsertionAtLast {
    Node head;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InsertionAtLast list = new InsertionAtLast();
        Node utils = new Node();
        list.head = utils.addNodesToLinkedList();
        System.out.println(" Before insertion ");
        utils.printLinkedList(list.head);
        System.out.println(" Enter the node to be added");
        int new_node_data = scanner.nextInt();
        list.insertingNodeAtLast(new_node_data, list.head);
        System.out.println(" After insertion ");
        utils.printLinkedList(list.head);
        scanner.close();
    }

    public void insertingNodeAtLast(int new_node_data, Node head) {
        if (head == null) {
            System.out.println("empty list");
            return ;
        } else {
            while(head!=null){
                if(head.next==null){
                    Node newNode = new Node();
                    newNode.data = new_node_data;
                    newNode.next = null;
                    head.next=newNode;
                    head=null;
                }else{
                    head=head.next;
                }

            }
        }
    }
}
