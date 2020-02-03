package Datastructure.LinkedList.Insertion;

import Datastructure.LinkedList.Utils.Node;

import java.util.Scanner;

public class InsertionAtStart {
    Node head;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InsertionAtStart obj = new InsertionAtStart();
        InsertionAtStart list = new InsertionAtStart();
        list.head = new Node();
        list.head.data = 1;

        // creating second node and attach it to the head
        Node node2 = new Node();
        node2.data = 2;

        // creating third node and attach with the first
        Node node3 = new Node();
        node3.data = 3;

        // creating last node and since it's the last node attach to the null;
        Node node4 = new Node();
        node4.data = 4;

        list.head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        Node utils = new Node();
        System.out.println(" Before insertion ");
        utils.printLinkedList(list.head);
        System.out.println(" Enter the node to be added");
        int new_node_data = scanner.nextInt();
        list.head = obj.insertingNodeAtHead(new_node_data, list.head);
        System.out.println(" After insertion ");
        utils.printLinkedList(list.head);
        scanner.close();
    }

    public Node insertingNodeAtHead(int new_node_data, Node head) {
        if (head == null) {
            System.out.println("empty list");
            return head;
        } else {
            Node newNode = new Node();
            newNode.data = new_node_data;
            newNode.next = head;
            return newNode;
        }
    }
}
