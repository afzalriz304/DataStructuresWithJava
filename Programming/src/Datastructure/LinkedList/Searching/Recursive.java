package Datastructure.LinkedList.Searching;

import Datastructure.LinkedList.Utils.Node;

import java.util.Scanner;

public class Recursive {
    Node head;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recursive recursive = new Recursive();
        Node node = new Node();
        recursive.head = node.addNodesToLinkedList();
        System.out.println("linked list :");
        node.printLinkedList(recursive.head);
        System.out.println("Enter the number to be searched");
        int num = scanner.nextInt();
        System.out.println("number found status : " + recursive.search(recursive.head, num));

    }

    public boolean search(Node head, int num) {
        if (head == null) {
            return false;
        } else if (num == head.data) {
            return true;
        }
        return search(head.next, num);
    }
}
