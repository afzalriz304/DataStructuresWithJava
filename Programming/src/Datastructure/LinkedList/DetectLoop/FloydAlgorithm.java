package Datastructure.LinkedList.DetectLoop;

/*
 * Floyd’s Cycle-Finding Algorithm: This is the fastest method and has been described below:
 * Traverse linked list using two pointers.
 * Move one pointer(slow_p) by one and another pointer(fast_p) by two.
 * If these pointers meet at the same node then there is a loop. If pointers do
 * not meet then linked list doesn’t have a loop
 * */

import Datastructure.LinkedList.Utils.Node;

public class FloydAlgorithm {
    public static void main(String[] args) {
        FloydAlgorithm obj = new FloydAlgorithm();

        // list with loop
        LoopedLinkedList loopedLinkedList = new LoopedLinkedList();
        Node loopedList = loopedLinkedList.loopedLinkedList();
        System.out.println(obj.FlyodAlgo(loopedList));

        // list w/o loop
        Node node = new Node();
        node.addNodesToLinkedList();
        System.out.println(obj.FlyodAlgo(node.addNodesToLinkedList()));
    }

    public boolean FlyodAlgo(Node head) {
        if (head == null) {
            return false;
        } else {
            Node slow_p = head, fast_p = head;
            while (head != null) {

                slow_p = slow_p.next;
                if(fast_p.next!=null){
                    fast_p = fast_p.next.next;
                }else{
                    return false;
                }


                if (slow_p == fast_p) {
                    return true;
                }

                head = head.next;

            }
            return false;
        }
    }
}
