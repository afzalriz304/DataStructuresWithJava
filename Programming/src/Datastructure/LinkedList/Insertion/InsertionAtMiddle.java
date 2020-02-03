package Datastructure.LinkedList.Insertion;

import Datastructure.LinkedList.Utils.Node;

import java.util.Scanner;

public class InsertionAtMiddle {
    Node head;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InsertionAtMiddle obj = new InsertionAtMiddle();
        InsertionAtMiddle list = new InsertionAtMiddle();
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
        System.out.println(" Enter the index to which it added");
        int index = scanner.nextInt();
        obj.insertingNodeAtMiddle(new_node_data, index, list.head);
        System.out.println(" After insertion ");
        utils.printLinkedList(list.head);
        scanner.close();
    }

    public void insertingNodeAtMiddle(int new_node_data, int index, Node head) {
        if (head == null) {
            System.out.println("empty list");
        } else {
            int i = 0;
            Node prev_node=new Node();
            while (head != null) {
                if (index == i) {
                    Node new_node = new Node();
                    new_node.data = new_node_data;
                    new_node.next = head;

                    prev_node.next=new_node;

                    head = new_node;
                }
                i++;
                prev_node=head;
                head = head.next;
            }
        }
    }
}
