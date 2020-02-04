package Datastructure.LinkedList.Deletion;

import Datastructure.LinkedList.Utils.Node;

import java.util.Scanner;

public class DeletingByKeyOrNode {
    Node head;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DeletingByKeyOrNode obj = new DeletingByKeyOrNode();
        Node node = new Node();
        obj.head = node.addNodesToLinkedList();
        System.out.println("Linked list:");
        node.printLinkedList(obj.head);
        System.out.println("Please choose the operation as number");
        System.out.println("1. Deleting by key");
        System.out.println("2. Deleting by node");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1:
                System.out.println("Enter the node point to be deleted");
                int node_point = scanner.nextInt();
                obj.DeleteNode(node_point);
                node.printLinkedList(obj.head);
                break;
            case 2:
                System.out.println("Enter the key to be deleted");
                int key = scanner.nextInt();
                obj.DeleteKey(key);
                node.printLinkedList(obj.head);
                break;
            default:
                System.out.println("unknown choice");
                break;
        }
    }

    /**
     * To delete a node from the linked lust
     *
     * @param node
     */
    public void DeleteNode(int node) {
        if (head == null) {
            System.out.println("Linkedlist is empty");
        } else if (node == 0) {
            head = head.next;
        } else {
            int i = 0;
            Node temp = head, prev = null;
            while (temp != null) {
                if (node == i) {
                    prev.next = temp.next;
                    return;
                }
                i++;
                prev = temp;
                temp = temp.next;
            }
        }
    }

    /**
     * To delete a particular key
     *
     * @param key
     */
    public void DeleteKey(int key) {
        if (head == null) {
            System.out.println("empty list");
            return;
        } else {
            int i = 0;
            Node temp = head, prev = null;
            while (temp != null) {

                if (temp.data == key) {
                    prev.next = temp.next;
                    return;
                }

                i++;
                prev = temp;
                temp = temp.next;
            }
        }
    }
}
