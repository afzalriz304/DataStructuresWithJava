package Datastructure.LinkedList.DetectLoop;

import Datastructure.LinkedList.Utils.Node;

import java.util.HashSet;

public class NormalApproach {

    public static void main(String[] args) {
        NormalApproach obj = new NormalApproach();

        // list with loop
        LoopedLinkedList loopedLinkedList = new LoopedLinkedList();
        Node loopedList = loopedLinkedList.loopedLinkedList();
        System.out.println(obj.FindLoop(loopedList));

        // list w/o loop
        Node node = new Node();
        node.addNodesToLinkedList();
        System.out.println(obj.FindLoop(node.addNodesToLinkedList()));
    }

    public boolean FindLoop(Node list) {
        if (list == null) {
            return false;
        } else {
            HashSet<Node> nodeHashSet = new HashSet<Node>();
            while (list != null) {
                if (nodeHashSet.contains(list.next)) {
                    return true;
                } else {
                    nodeHashSet.add(list.next);
                }
                list = list.next;
            }
        }
        return false;
    }
}
