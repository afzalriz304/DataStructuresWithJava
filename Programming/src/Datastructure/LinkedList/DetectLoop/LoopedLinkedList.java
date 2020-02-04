package Datastructure.LinkedList.DetectLoop;

import Datastructure.LinkedList.Utils.Node;

public class LoopedLinkedList {
    Node head;

    public Node loopedLinkedList() {
        LoopedLinkedList loopedLinkedList = new LoopedLinkedList();
        Node node = new Node();
        loopedLinkedList.head = node.addNodesToLinkedList();
        node.printLinkedList(loopedLinkedList.head);
        // creating loop
        // 1->2->3->4->5->2
        loopedLinkedList.head.next.next.next.next.next =
                loopedLinkedList.head.next;
        /*
         * [1]-->[2]-->[3]
         *       ^      |
         *       |      |
         *       [5]<--[4]
         * */
        return loopedLinkedList.head;
    }
}
